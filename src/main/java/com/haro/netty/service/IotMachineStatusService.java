package com.haro.netty.service;

import com.haro.netty.test.pojo.IotMachineStatus;

public interface IotMachineStatusService {

	/**
	 * 
	* @Title: updataMachineStatus  
	* @Description: TODO  更新机器状态
	* @param @param iotMachineInfo    参数  
	* @return void    返回类型  
	* @throws
	 */
	public void updataMachineStatus(IotMachineStatus iotMachineStatus);
}
