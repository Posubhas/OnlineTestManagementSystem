package com.cg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.entities.User;
import com.cg.otms.service.TestService;
import com.cg.otms.service.UserService;
import com.cg.otms.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
	@Autowired
	TestService testService;
	@Autowired
	UserService userService;
	@Autowired
	private UserServiceImpl uService;

	@PutMapping("/assignTest/{userId}/{testId}")
	public User assignTest(@PathVariable int userId, @PathVariable int testId) {
		return uService.assignTest(userId, testId);
	}

}
