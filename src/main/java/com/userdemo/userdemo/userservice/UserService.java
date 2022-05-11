package com.userdemo.userdemo.userservice;

import java.util.List;

import com.userdemo.userdemo.entities.User;

public interface UserService {

	User getUser(long userId);

	List<User> getUser();

	void addUser(User user);

}
