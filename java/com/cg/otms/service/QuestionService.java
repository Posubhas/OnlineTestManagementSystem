package com.cg.otms.service;

import java.util.List;

import com.cg.otms.entities.Question;

public interface QuestionService {
	public List<Question> findAllQuestions();

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public Question deleteQuestion(int id);
}
