package com.cg.otms.service;

import com.cg.otms.entities.Question;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public Question deleteQuestion(int id);

}
