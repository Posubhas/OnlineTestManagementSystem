package com.cg.otms.service;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.mapping.Array;

import com.cg.otms.entities.Question;

public interface QuestionService {
	List<Question> findAllQuestions();

	List<Question> addQuestion();


	
	


}