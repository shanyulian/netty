package java.com.haro.netty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haro.netty.service.UserServiceI;
import com.haro.netty.test.mapper.TUserMapper;
import com.haro.netty.test.pojo.TUser;


@Service("userService")
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private TUserMapper tUserMapper;//注入dao
	
	@Override
	public void addUser(TUser user) {
		// TODO Auto-generated method stub
		tUserMapper.insert(user);
	}

	@Override
	public TUser getUserById(int userId) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByPrimaryKey(userId);
	}

	
	
}
