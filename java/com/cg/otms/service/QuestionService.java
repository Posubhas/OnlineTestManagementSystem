package com.cg.otms.service;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.mapping.Array;

import com.cg.otms.entities.Question;

public interface QuestionService {
	public List<Question> findAllQuestions();

	public Question addQuestion(Question question);

<<<<<<< HEAD
	public Question updateQuestion(Question question);

	public Question deleteQuestion(int id);
=======
	//void deleteById(int id);

	List<Question> updateQuestion(Question question);

	List<Question> deleteQuestion(Question question);


	
	


>>>>>>> ac8b7f09c35d4aaeb4816878ef7887f7d767836f
}
