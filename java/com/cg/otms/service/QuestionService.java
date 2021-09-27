package com.cg.otms.service;

import java.util.List;

import com.cg.otms.entities.Question;

public interface QuestionService {
	List<Question> findAllQuestions();

	List<Question> addQuestion();

	List<Question> updateQuestion(Question question);

	List<Question> deleteQuestion(Question question);

}
