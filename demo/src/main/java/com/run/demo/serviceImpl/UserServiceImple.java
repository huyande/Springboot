package com.run.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.demo.mapper.UserMapper;
import com.run.demo.model.User;
import com.run.demo.service.UserService;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public User findByUserId(Integer id) {
		User user = mapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public void addByUser(User user) {
		mapper.insert(user);
	}

}
