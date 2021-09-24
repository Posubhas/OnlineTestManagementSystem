package com.cg.otms.controller;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.otms.entities.Question;
import com.cg.otms.service.QuestionService;
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@GetMapping("/find")
	public List<Question> getallQuestions() {
		return questionService.findAllQuestions();
	}
@PutMapping
	public List<Question> addQuestion() {
	return questionService.addQuestion();

}

}
