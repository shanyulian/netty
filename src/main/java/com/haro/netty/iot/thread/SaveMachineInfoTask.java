package com.haro.netty.iot.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haro.netty.iot.staticOfFinal.IOTValue;
import com.haro.netty.service.IotMachineInfoService;
import com.haro.netty.test.pojo.IotMachineInfo;
import com.haro.netty.util.ByteUtil;
import com.haro.netty.util.DataUtils;
import com.haro.netty.util.SpringUtil;

/**
 * 
* @ClassName: SaveMachineInfoTask  
* @Description: TODO  存储机器信息的 线程
* @author 单雨连
* @Email shanyulian@aliyun.com 
* @date 2017年1月19日 上午9:45:20
 */
public class SaveMachineInfoTask implements Runnable,IOTValue {
	private static final Logger logger = LoggerFactory.getLogger(SaveMachineInfoTask.class);
	private byte[] readbuf ;
	private String device ;
	
	
	public SaveMachineInfoTask(byte[] readbuf) {
	
		this.readbuf = readbuf;
	}


	public SaveMachineInfoTask(byte[] readbuf, String device) {
		this.readbuf = readbuf;
		this.device = device;
	}


	@Override
	public void run() {
		
		IotMachineInfo iotMachineInfo = new IotMachineInfo();
		iotMachineInfo.setDeviceName(device);//机器编号
		// TODO Auto-generated method stub
		try {
          
//==============毛巾状态温度=====================
			switch (readbuf[TEMP_STATUS_BIT]) {
			//加热
			case TEMP_STATUS_HEAT:
				iotMachineInfo.setTempStatus(STR_TEMP_STATUS_HEAT);
				break;
			//制冷
			case TEMP_STATUS_COLD:
				iotMachineInfo.setTempStatus(STR_TEMP_STATUS_COLD);
				break;
			//常温
			case TEMP_STATUS_NORMAL:
				iotMachineInfo.setTempStatus(STR_TEMP_STATUS_NORMAT);
				break;
			}
			
//============毛巾长度=========================
			switch (readbuf[TWOEL_LENGTH_BIT]) {
			//加热
			case TWOEL_LENGTH_24CM:
				iotMachineInfo.setTwoelLength(STR_TWOEL_LENGTH_24CM);;
				break;
			//制冷
			case TWOEL_LENGTH_21CM:
				iotMachineInfo.setTempStatus(STR_TWOEL_LENGTH_21CM);
				break;
			//常温
			case TWOEL_LENGTH_18CM:
				iotMachineInfo.setTempStatus(STR_TWOEL_LENGTH_18CM);
				break;
			}
//===========报警状态==========================
			switch (readbuf[ALARM_STATUS_BIT]) {
			case ALARM_STATUS_NORMAL:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_NORMAL);
				break;
			case ALARM_STATUS_NO_WATER:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_NO_WATER);
				break;
			case ALARM_STATUS_NO_TWOEL:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_NO_TWOEL);
				break;
			case ALARM_STATUS_KNIFE_FAULT:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_KNIFE_FAULT);
				break;
			case ALARM_STATUS_SURPLUS:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_SURPLUS);
				break;
			case ALARM_STATUS_FOLD_TWOLE_EXCEPTION:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_FOLD_TWOLE_EXCEPTION);
				break;
			case ALARM_STATUS_HEAT_CHANNEL_EXCEPTION:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_HEAT_CHANNEL_EXCEPTION);
				break;
			case ALARM_STATUS_HEAT_WATER_PUMP_EXCEPTION:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_HEAT_WATER_PUMP_EXCEPTION);
				break;
			case ALARM_STATUS_HEAT_DTU_ALARM:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_HEAT_DTU_ALARM);
				break;
			case ALARM_STATUS_LOCK:
				iotMachineInfo.setAlarmStatus(STR_ALARM_STATUS_LOCK);
				break;
			}
//==========================温度=========================
			switch (readbuf[TEMP_MODEL_BIT]) {
			case TEMP_MODEL_POSITIVE:
				iotMachineInfo.setTempModel(Byte.toString(readbuf[TEMP_DATA_BIT_OEN]) + "." + Byte.toString(readbuf[TEMP_DATA_BIT_TWO]));
				break;

			case TEMP_MODEL_NEGATIVE:
				iotMachineInfo.setTempModel("-"+Byte.toString(readbuf[TEMP_DATA_BIT_OEN]) + "." + Byte.toString(readbuf[TEMP_DATA_BIT_TWO]));
				break;
			}
//======================总出巾量=========================
			iotMachineInfo.setTotalTwoelNum(ByteUtil.ByteToInt(readbuf, TOTAL_TWOEL_BIT_ONE, TOTAL_TWOEL_BIT_SIX));
//======================新卷出巾量=======================
			iotMachineInfo.setNewTotalNum(ByteUtil.ByteToInt(readbuf, NEW_VOLUME_NUMBER_BIT_ONE, NEW_VOLUME_NUMBER_FOUR));
//======================剩余量=========================
			iotMachineInfo.setSurplus(ByteUtil.ByteToInt(readbuf, SURPLUS_BIT_ONE, SURPLUS_BIT_FOUR));
//=======================水量=========================
			iotMachineInfo.setWaterCapacity("8.8L");//数据没有，写默认值
//======================水源=======================
			iotMachineInfo.setWaterSource("桶装水");
//=====================PH=========================
			iotMachineInfo.setPh("5.5");
//=====================投币数======================
			iotMachineInfo.setTotalCoins(ByteUtil.ByteToInt(readbuf, TOTAL_COINS_BIT_ONE, TOTAL_COINS_BIT_FOUR));
//=====================移动支付数====================
			iotMachineInfo.setMobilePay(ByteUtil.ByteToInt(readbuf, MOBILE_PAY_BIT_ONE, MOBILE_PAY_BIT_FOUR));
//=====================刷卡数===================
			iotMachineInfo.setPayCard(ByteUtil.ByteToInt(readbuf, PAY_CARD_BIT_ONE, PAY_CARD_BIT_FOUR));
//=====================产品SN==================
			iotMachineInfo.setDeviceSn(ByteUtil.ByteToString(readbuf, SN_BIT_ONE, SN_BIT_FOUR));
//=====================插入时间=================
			iotMachineInfo.setReturnTime(DataUtils.getDate("yyyy-MM-dd HH:mm:ss"));
			IotMachineInfoService iotMachineInfoService =  (IotMachineInfoService) SpringUtil.getApplicationContext().getBean("iotMachineInfoService");
			iotMachineInfoService.updataIotMachineInfo(iotMachineInfo);
        } catch (Exception e) {
            //e.printStackTrace();
          logger.error(e.getMessage());  
        }

	}

}
