package com.cg.otms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.otms.entities.Question;
import com.cg.otms.service.QuestionService;

public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@GetMapping("/find")
	public List<Question> getallQuestions() {
		return questionService.findAllQuestions();
	}

	@PutMapping("/add")
	public List<Question> addQuestion() {
		return questionService.addQuestion();
	}

	@PutMapping("/update")
	public List<Question> updateQuestion(@RequestBody Question question) {
		return questionService.updateQuestion(question);
	}

	@DeleteMapping("/delete")
	public List<Question> deleteQuestion(@RequestBody Question question) {
		return questionService.deleteQuestion(question);
	}
}
