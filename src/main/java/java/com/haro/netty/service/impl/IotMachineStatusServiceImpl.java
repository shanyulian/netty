package java.com.haro.netty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.haro.netty.service.IotMachineStatusService;
import com.haro.netty.test.mapper.IotMachineStatusMapper;
import com.haro.netty.test.pojo.IotMachineStatus;


@Service("iotMachineStatusService")
public class IotMachineStatusServiceImpl implements IotMachineStatusService {

	@Autowired
	private IotMachineStatusMapper iotMachineStatusMapper;//注入dao
	@Override
	public void updataMachineStatus(IotMachineStatus iotMachineStatus) {
		// TODO Auto-generated method stub
		IotMachineStatus iotInfo = iotMachineStatusMapper.selectByPrimaryKey(iotMachineStatus.getDeviceName());
		if(iotInfo == null){
			iotMachineStatusMapper.insert(iotMachineStatus);
		}else{
			iotMachineStatusMapper.updateByPrimaryKey(iotMachineStatus);
		}
	}

}
