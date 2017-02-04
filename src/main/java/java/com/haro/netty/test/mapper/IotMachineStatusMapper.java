package java.com.haro.netty.test.mapper;

import com.haro.netty.test.pojo.IotMachineStatus;
import com.haro.netty.test.pojo.IotMachineStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotMachineStatusMapper {
    int countByExample(IotMachineStatusExample example);

    int deleteByExample(IotMachineStatusExample example);

    int deleteByPrimaryKey(String deviceName);

    int insert(IotMachineStatus record);

    int insertSelective(IotMachineStatus record);

    List<IotMachineStatus> selectByExample(IotMachineStatusExample example);

    IotMachineStatus selectByPrimaryKey(String deviceName);

    int updateByExampleSelective(@Param("record") IotMachineStatus record, @Param("example") IotMachineStatusExample example);

    int updateByExample(@Param("record") IotMachineStatus record, @Param("example") IotMachineStatusExample example);

    int updateByPrimaryKeySelective(IotMachineStatus record);

    int updateByPrimaryKey(IotMachineStatus record);
}