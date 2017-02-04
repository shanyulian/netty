package com.haro.netty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haro.netty.service.IotMachineInfoService;
import com.haro.netty.test.mapper.IotMachineInfoMapper;
import com.haro.netty.test.pojo.IotMachineInfo;



@Service("iotMachineInfoService")
public class IotMachineInfoServiceImpl implements IotMachineInfoService {

	@Autowired
	private IotMachineInfoMapper iotMachineInfoMapper;//注入dao
	@Override
	public void updataIotMachineInfo(IotMachineInfo iotMachineInfo) {
		// TODO Auto-generated method stub
		iotMachineInfoMapper.insert(iotMachineInfo);

	}

}
