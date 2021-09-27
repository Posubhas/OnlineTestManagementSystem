package com.cg.otms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.entities.Test;
import com.cg.otms.service.TestService;

@RestController
@RequestMapping("/testcontroller")
@CrossOrigin(origins = "*")
@Validated
public class TestController {
	@Autowired
	TestService testService;

	@PostMapping("/addtest")
	public Test newTest(@RequestBody Test test) {
		return testService.addTest(test);
	}

	@PutMapping("/updatetest")
	public Test updateTest(@RequestBody Test test) {
		return testService.updateTest(test);
	}

	@DeleteMapping("/deletetest")
	public Test deleteTest(@RequestBody Test test) {
		return testService.deleteTest(test);
	}
}