package java.com.haro.netty.iot.staticOfFinal;

import java.util.Hashtable;

import io.netty.channel.ChannelHandlerContext;

public class IOTStaticValue {
	
	
	/**
	 * ip 和  ChannelHandlerContext 
	 */
	// public static Hashtable<String, ChannelHandlerContext> ipOfChannelHandlerContext = new Hashtable();

	 
	 /**
	  * 机器编号  对应的 ChannelHandlerContext 
	  */
	 public static Hashtable<String, ChannelHandlerContext> deviceOfChannelHandlerContext = new Hashtable();
	 
	 /**
	  * ip 对应 机器编号
	  */
	 public static Hashtable<String , String> ipOfDevice =  new Hashtable();
}
