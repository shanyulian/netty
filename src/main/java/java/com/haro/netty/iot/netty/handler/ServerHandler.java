package java.com.haro.netty.iot.netty.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.haor.netty.iot.thread.SaveMachineInfoTask;
import com.haor.netty.iot.threadpool.ExecutorProcessPool;
import com.haro.netty.iot.staticOfFinal.IOTStaticValue;
import com.haro.netty.iot.staticOfFinal.IOTValue;
import com.haro.netty.service.IotMachineStatusService;
import com.haro.netty.test.pojo.IotMachineStatus;
import com.haro.netty.util.ByteUtil;
import com.haro.netty.util.SpringUtil;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 
* @ClassName: ServerHandler  
* @Description: TODO  netty 重要接口
* @author 单雨连
* @Email shanyulian@aliyun.com 
* @date 2017年1月13日 上午10:21:42
 */
@Component
@Qualifier("serverHandler")
@Sharable
public class ServerHandler extends ChannelInboundHandlerAdapter implements IOTValue{
	private static final Logger logger = LoggerFactory.getLogger(ServerHandler.class);
	
	/**
	 * 客户的登入
	 */
	@Override
	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		//super.channelRegistered(ctx);
		logger.info("client: "+ ctx.channel().remoteAddress()+ "channelRegistered");
	}
	/**
	 * 客户端退出
	 */
	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		//super.channelUnregistered(ctx);
		
	/**
	 * 客户端退出
	 */
		
		String device =	IOTStaticValue.ipOfDevice.get(ctx.channel().remoteAddress().toString());
		logger.info("device: "+device +" IP :"+ ctx.channel().remoteAddress()+ " exit");
		//IOTStaticValue.ipOfChannelHandlerContext.remove(ctx.channel().remoteAddress().toString());
		IOTStaticValue.deviceOfChannelHandlerContext.remove(device);
		IOTStaticValue.ipOfDevice.remove(ctx.channel().remoteAddress().toString());
		IotMachineStatusService iotMachineStatusService =  (IotMachineStatusService) SpringUtil.getApplicationContext().getBean("iotMachineStatusService");
		IotMachineStatus iotMachineStatus = new IotMachineStatus(); 
		 // iotMachineStatus.setDeviceInfo(1);
	    	 iotMachineStatus.setDeviceName(device);
	    	 iotMachineStatus.setDeviceStatus(2);
	    	 iotMachineStatusService.updataMachineStatus(iotMachineStatus);
	}
	/**
	 * 客户接入
	 */
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		//super.channelActive(ctx);
		logger.info("client: "+ ctx.channel().remoteAddress()+ "channelActive");
		
	
	}
	/**
	 * 客户端断开
	 */
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		super.channelInactive(ctx);
		logger.info("client: "+ ctx.channel().remoteAddress()+ "channelInactive");
	}
	/**
	 * 接受到数据
	 */
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		// TODO Auto-generated method stub
		//super.channelRead(ctx, msg);
		//获取byte数据
		  ByteBuf in = (ByteBuf) msg;
		  byte[]req = new byte[in.readableBytes()];
		  in.readBytes(req);
		  if(req.length == LOGIN_PACKAGR_LENGTH){
			  //登入包
			  if(req[Heartbeat_BIT_ONE] == Heartbeat && req[Heartbeat_BIT_TWO] == Heartbeat && req[Heartbeat_BIT_THREE] == Heartbeat && req[Heartbeat_BIT_FOUR] == Heartbeat){
				  
				  byte[]dtuBuf = new byte[4];
				  dtuBuf[0] = req[DEVICE_BIT_ONE];
				  dtuBuf[1] = req[DEVICE_BIT_TWO];
				  dtuBuf[2] = req[DEVICE_BIT_THREE];
				  dtuBuf[3] = req[DEVICE_BIT_FOUR];
				  String device = new String(dtuBuf);
				  IOTStaticValue.deviceOfChannelHandlerContext.put(device, ctx);//Device 和 ChannelHandlerContext 
				  IOTStaticValue.ipOfDevice.put(ctx.channel().remoteAddress().toString(), device);
				 // PushController pushController = (PushController) SpringUtil.getApplicationContext().getBean("pushController");
				  logger.info("device:"+device + " IP:"+ ctx.channel().remoteAddress()+ "login");
				  IotMachineStatusService iotMachineStatusService =  (IotMachineStatusService) SpringUtil.getApplicationContext().getBean("iotMachineStatusService");
				  IotMachineStatus iotMachineStatus = new IotMachineStatus(); 
				 // iotMachineStatus.setDeviceInfo(1);
			    	 iotMachineStatus.setDeviceName(device);
			    	 iotMachineStatus.setDeviceStatus(1);
			    	 iotMachineStatusService.updataMachineStatus(iotMachineStatus);
			  }
		  }else if(req.length == DEVICE_DATA_LENGTH){
			  // 机器返回的数据
			  if(req[DATA_FRAME_HEAD_BIT_ONE] == DATA_FRAME_HEAD_ONE && req[DATA_FRAME_HEAD_BIT_TWO] == DATA_FRAME_HEAD_TWO){
				  logger.info(ByteUtil.bytesToHexString(req));
				  ExecutorProcessPool pool = ExecutorProcessPool.getInstance();
				  String device =	IOTStaticValue.ipOfDevice.get(ctx.channel().remoteAddress().toString());
				  pool.execute(new SaveMachineInfoTask(req,device));
			  }
		  }
			  
		
	}
	/**
     * ctx.write(Object)方法不会使消息写入到通道上，
     * 他被缓冲在了内部，你需要调用ctx.flush()方法来把缓冲区中数据强行输出。
     * 或者你可以在channelRead方法中用更简洁的cxt.writeAndFlush(msg)以达到同样的目的
     * @param ctx
     * @throws Exception
     */
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		//super.channelReadComplete(ctx);
		   ctx.flush();
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		// TODO Auto-generated method stub
		super.userEventTriggered(ctx, evt);
	}

	@Override
	public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		super.channelWritabilityChanged(ctx);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		// TODO Auto-generated method stub
		super.exceptionCaught(ctx, cause);
	}
	
	

}
