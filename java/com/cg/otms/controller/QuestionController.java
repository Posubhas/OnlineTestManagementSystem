package com.cg.otms.controller;

import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.validation.annotation.Validated;
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f

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
<<<<<<< HEAD

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
=======
@PutMapping("/add")
	public List<Question> addQuestion() {
	return questionService.addQuestion(); 
}
@PutMapping("/update")
public List<Question> updateQuestion(@RequestBody Question question){
	return questionService.updateQuestion(question);	
}
@DeleteMapping("/delete")
public List<Question> deleteQuestion(@RequestBody Question question){
	return questionService.deleteQuestion(question);
}
>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
}
