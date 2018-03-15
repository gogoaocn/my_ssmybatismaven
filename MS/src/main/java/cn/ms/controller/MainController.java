package cn.ms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ms.common.Constants;
import cn.ms.service.UserService;

/**
 * 系统主控制层 2018-1-22
 * @author yzw09
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public int test1(String userName, String password, HttpServletRequest request) {
		int result = this.userService.login(userName, password);
		
		//保存登录用户信息
    	request.getSession().setAttribute(Constants.LOGIN_USERNAME, userName);
		
		return result;
	}
	
}
