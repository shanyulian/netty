package com.haro.netty.iot.staticOfFinal;

/**
 * 
* @ClassName: IOTValue  
* @Description: TODO  机器返回信息 通讯协议
* @author 单雨连
* @Email shanyulian@aliyun.com 
* @date 2017年1月16日 下午2:12:28
 */
public interface IOTValue {

	//登入包的长度 格式为KKKK+DTU编号（四位）+KKKK
	public static final int LOGIN_PACKAGR_LENGTH = 12;
	
	//机器返回的数据命令
	public static final int DEVICE_DATA_LENGTH = 42;
	
	
	/**
	 * 心跳包的位数 和 心跳包的格式
	 */
	public static final byte Heartbeat= (byte) 0x4B;//心跳包
	public static final int  Heartbeat_BIT_ONE = 0;
	public static final int  Heartbeat_BIT_TWO = 1;
	public static final int  Heartbeat_BIT_THREE = 2;
	public static final int  Heartbeat_BIT_FOUR= 3;
	
	/**
	 * DTU 编号
	 */
	public static final int DEVICE_BIT_ONE = 4;
	public static final int DEVICE_BIT_TWO = 5;
	public static final int DEVICE_BIT_THREE = 6;
	public static final int DEVICE_BIT_FOUR = 7;
	
	/**
	 * 数据包 格式
	 */
	public static final byte DATA_FRAME_HEAD_ONE = (byte) 0xFF;
	
	public static final byte DATA_FRAME_HEAD_TWO = (byte) 0x20;
	
	public static final byte DATA_FRAME_HEAD_END = (byte) 0xFF;
	
	public static final int  DATA_FRAME_HEAD_BIT_ONE = 0;//数据帧头的第0位
	
	public static final int  DATA_FRAME_HEAD_BIT_TWO = 1;//数据帧头的第1位
	
	public static final int DATA_FRAME_HEAD_BIT_END = 41;//数据帧头的最后一位
	
	/**
	 * 温度状态解析位
	 */
	public static final int TEMP_STATUS_BIT = 2;//温度状态的位数
	public static final byte TEMP_STATUS_HEAT = 0x00;
	public static final byte TEMP_STATUS_COLD = 0x01;
	public static final byte TEMP_STATUS_NORMAL = 0x02;
	public static final String STR_TEMP_STATUS_HEAT = "加热";
	public static final String STR_TEMP_STATUS_COLD= "制冷";
	public static final String STR_TEMP_STATUS_NORMAT = "常温";
	/**
	 * 毛巾长度
	 */
	public static final int TWOEL_LENGTH_BIT = 3;//毛巾长度
	public static final byte TWOEL_LENGTH_24CM = 0x00;
	public static final byte TWOEL_LENGTH_18CM = 0x01;
	public static final byte TWOEL_LENGTH_21CM = 0x02;
	public static final String STR_TWOEL_LENGTH_24CM = "24CM";
	public static final String STR_TWOEL_LENGTH_18CM= "18CM";
	public static final String STR_TWOEL_LENGTH_21CM = "21CM";
	/**
	 * 报警状态
	 * 	00表示正常  01表示报警1(缺水)    02表示报警2 （缺巾）  

	   03表示报警3（故障卡刀）  04表示报警4 （剩余不足）  

	05 折巾异常 06加热管故障 07加热水泵异常 08 DTU报警 09 已上锁
	 */
	public static final int  ALARM_STATUS_BIT = 4;
	public static final byte ALARM_STATUS_NORMAL = (byte)0x00;
	public static final byte ALARM_STATUS_NO_WATER=(byte)0x01;
	public static final byte ALARM_STATUS_NO_TWOEL=(byte)0x02;
	public static final byte ALARM_STATUS_KNIFE_FAULT= (byte)0x03;
	public static final byte ALARM_STATUS_SURPLUS = (byte)0x04;
	public static final byte ALARM_STATUS_FOLD_TWOLE_EXCEPTION = (byte)0x05;
	public static final byte ALARM_STATUS_HEAT_CHANNEL_EXCEPTION = (byte)0x06;
	public static final byte ALARM_STATUS_HEAT_WATER_PUMP_EXCEPTION = (byte)0x07;
	public static final byte ALARM_STATUS_HEAT_DTU_ALARM =(byte)0x08;
	public static final byte ALARM_STATUS_LOCK =(byte)0x09;
	
	public static final String STR_ALARM_STATUS_NORMAL = "正常";
	public static final String STR_ALARM_STATUS_NO_WATER ="缺水";
	public static final String STR_ALARM_STATUS_NO_TWOEL ="缺巾";
	public static final String STR_ALARM_STATUS_KNIFE_FAULT="故障卡刀";
	public static final String STR_ALARM_STATUS_SURPLUS="剩余不足";
	public static final String STR_ALARM_STATUS_FOLD_TWOLE_EXCEPTION="折巾异常";
	public static final String STR_ALARM_STATUS_HEAT_CHANNEL_EXCEPTION="加热管故障 ";
	public static final String STR_ALARM_STATUS_HEAT_WATER_PUMP_EXCEPTION="加热水泵异常";
	public static final String STR_ALARM_STATUS_HEAT_DTU_ALARM="DTU报警 ";
	public static final String STR_ALARM_STATUS_LOCK="已上锁 ";
	
	
	/**
	 * 温度状态
	 */
	public static final int TEMP_MODEL_BIT = 5;
	public static final byte TEMP_MODEL_POSITIVE = (byte)0x00;
	public static final byte TEMP_MODEL_NEGATIVE = (byte)0x01;
	
	public static final int TEMP_DATA_BIT_OEN = 6;
	public static final int TEMP_DATA_BIT_TWO = 7;
	
	/**
	 * 总出巾量 00 01 23 45 67 89 	//8-13 （6位）总出巾量 
	 */
	public static final int TOTAL_TWOEL_BIT_ONE = 8;
	public static final int TOTAL_TWOEL_BIT_TWO = 9;
	public static final int TOTAL_TWOEL_BIT_THREE = 10;
	public static final int TOTAL_TWOEL_BIT_FOUR = 11;
	public static final int TOTAL_TWOEL_BIT_FIVE = 12;
	public static final int TOTAL_TWOEL_BIT_SIX = 13;
	
	/**
	 *新卷出巾量 00 01 02 03  		//14-17（4位）新卷出巾量
	 */
	public static final int NEW_VOLUME_NUMBER_BIT_ONE = 14;
	public static final int NEW_VOLUME_NUMBER_TWO = 15;
	public static final int NEW_VOLUME_NUMBER_THREE = 16;
	public static final int NEW_VOLUME_NUMBER_FOUR = 17;
	
	/**
	 *18-21 (4位) 剩余量 SURPLUS
	 */
	public static final int SURPLUS_BIT_ONE = 18;
	public static final int SURPLUS_BIT_TWO = 19;
	public static final int SURPLUS_BIT_THREE = 20;
	public static final int SURPLUS_BIT_FOUR = 21;
	/**
	 * 11 			//22    (1位) 水量 升
	 */
	public static final int WATER_CAPACITY_BIT = 22;
	/**
	 * 01 			//23    (1位) 水源 01 自来水 02 桶装水
	 */
	public static final int WATER_SOURCE_BIT = 23;
	
	/**
	 * 47 			//24	(1位）PH  获取的数值除以10得到PH值 比如 47 对应的10进制是 71 那么PH值就是 7.1 
	 */
	public static final int PH_BIT = 24;
	/**
	 * 00 00 00 01 		//25-28（4位）投币数
	 */
	public static final int TOTAL_COINS_BIT_ONE = 25;
	public static final int TOTAL_COINS_BIT_TWO = 26;
	public static final int TOTAL_COINS_BIT_THREE = 27;
	public static final int TOTAL_COINS_BIT_FOUR = 28;
	/**
	 * 29-32（4位）移动支付数
	 */
	public static final int MOBILE_PAY_BIT_ONE = 29;
	public static final int MOBILE_PAY_BIT_TWO = 30;
	public static final int MOBILE_PAY_BIT_THREE = 31;
	public static final int MOBILE_PAY_BIT_FOUR = 32;
	/**
	 * //33-36（4位）刷卡数
	 */
	public static final int PAY_CARD_BIT_ONE = 33;
	public static final int PAY_CARD_BIT_TWO = 34;
	public static final int PAY_CARD_BIT_THREE = 35;
	public static final int PAY_CARD_BIT_FOUR = 36;
	/**
	 * 37-40（4位）产品SN 
	 */
	public static final int SN_BIT_ONE = 37;
	public static final int SN_BIT_TWO = 38;
	public static final int SN_BIT_THREE = 39;
	public static final int SN_BIT_FOUR = 40;
}
