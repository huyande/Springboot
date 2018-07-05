package com.run.demo.service;

import com.run.demo.model.User;

public interface UserService {

	public User findByUserId(Integer id);

	public void addByUser(User user);
}
