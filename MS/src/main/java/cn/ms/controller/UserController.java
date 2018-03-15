package cn.ms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ms.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	
	@RequestMapping("/test1")
	@ResponseBody
	public String test1(HttpServletResponse response) {
		System.out.println("前端请求成功！！！");
		return "李鸽";
	}
	

}