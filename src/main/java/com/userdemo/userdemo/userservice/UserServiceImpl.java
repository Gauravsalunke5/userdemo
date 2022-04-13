package com.userdemo.userdemo.userservice;

import org.springframework.stereotype.Service;

import com.userdemo.userdemo.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(long userId) {
		System.out.println(userId);
		return null;
	}

}
