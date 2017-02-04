package com.haro.netty.test.mapper;

import com.haro.netty.test.pojo.IotMachineInfo;
import com.haro.netty.test.pojo.IotMachineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotMachineInfoMapper {
    int countByExample(IotMachineInfoExample example);

    int deleteByExample(IotMachineInfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(IotMachineInfo record);

    int insertSelective(IotMachineInfo record);

    List<IotMachineInfo> selectByExample(IotMachineInfoExample example);

    IotMachineInfo selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") IotMachineInfo record, @Param("example") IotMachineInfoExample example);

    int updateByExample(@Param("record") IotMachineInfo record, @Param("example") IotMachineInfoExample example);

    int updateByPrimaryKeySelective(IotMachineInfo record);

    int updateByPrimaryKey(IotMachineInfo record);
}