package com.userdemo.userdemo.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdemo.userdemo.entities.User;
import com.userdemo.userdemo.userservice.UserService;

@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(Long.parseLong(userId));
	}

	@GetMapping("/users")
	public List<User> getUser() {
		return userService.getUser();
	}

	@PostMapping("/users")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "ok";
	}

}
