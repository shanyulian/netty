package com.haro.netty.service;

import com.haro.netty.test.pojo.TUser;

public interface UserServiceI {
	 /**
	 8      * 添加用户
	 9      * @param user
	10      */
	     void addUser(TUser user);
	     
	     /**
	     * 根据用户id获取用户
	      * @param userId
	      * @return
	     */
	    TUser getUserById(int userId);
	    /**
	     * aesfd
	     */
	    
	    
}
