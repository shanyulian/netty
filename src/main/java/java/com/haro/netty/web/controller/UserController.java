package java.com.haro.netty.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haro.netty.service.UserServiceI;
import com.haro.netty.test.pojo.TUser;

@Controller  
@RequestMapping("/user")
public class UserController {
	
	
	      @Autowired  
	    private UserServiceI userService;  
	      
	    @RequestMapping("/showInfo/{userId}")  
	    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){  
	    	TUser userInfo = userService.getUserById(userId);  
	        modelMap.addAttribute("userInfo", userInfo);  
	        return "/user/showInfo";  
	    }  
	      
	    @RequestMapping("/showInfos/{userId}")  
	    public @ResponseBody Object showUserInfos(@PathVariable int userId){  
	        TUser userInfos = userService.getUserById(userId);  
	        return userInfos;  
	    }  

}
