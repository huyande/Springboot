package com.run.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.run.demo.model.User;
import com.run.demo.service.UserService;

@RestController
public class StartController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/hello")
	public String start() {
		return "hello springBoot";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		System.out.println("热部署成功");
		return "index";
	}
	
	/**
	 * 根据ID查询用户
	 * 访问路径 http://localhost:8080/find?id=1;
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/find")
	public User find(Integer id) {
		User user = userService.findByUserId(id);
		return user;
	}
	
	@RequestMapping(value="/add")
	public String find() {
		User user = new User();
		user.setName("张三");
		user.setAddress("宁夏");
		userService.addByUser(user);
		return "添加成功";
	}
	
	
	
}
