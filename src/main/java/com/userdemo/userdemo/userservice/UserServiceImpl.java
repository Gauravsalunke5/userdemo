package com.userdemo.userdemo.userservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.userdemo.userdemo.entities.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> userList = new ArrayList<>();

	@PostConstruct
	public void loadData() {
		userList.add(new User(1, "u1", "u1@abc.com", 123));
		userList.add(new User(2, "u1", "u1@abc.com", 123));

	}

	@Override
	public User getUser(long userId) {
		User user = null;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getId() == userId) {
				user = userList.get(i);
				break;
			}
		}
		return user;
	}

	@Override
	public List<User> getUser() {
		return userList;
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}
