package com.cg.otms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.entities.Question;
import com.cg.otms.service.QuestionService;

@RestController
@RequestMapping("/questionscontroller")
@CrossOrigin(origins = "*")
@Validated
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@GetMapping("/find")
	public List<Question> getallQuestions() {
		return questionService.findAllQuestions();
	}

	@PutMapping("/add")
	public Question addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}

	@PutMapping("/update")
	public Question updateQuestion(@RequestBody Question question) {
		return questionService.updateQuestion(question);
	}

	@DeleteMapping("/delete/{id}")
	public Question deleteQuestion(@PathVariable("id") int id) {
		return questionService.deleteQuestion(id);
	}
}
