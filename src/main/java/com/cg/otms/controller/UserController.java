package com.cg.otms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.dto.TestDetails;
import com.cg.otms.entities.Test;
import com.cg.otms.service.UserService;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
	@Autowired
	private UserService uService;

	public TestDetails addTest(Test test) {

		return uService.addTest();
	}
	

}
