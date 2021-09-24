package com.cg.otms.service;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.otms.dao.QuestionDao;
import com.cg.otms.entities.Question;

public class QuestionServiceImpl implements QuestionService {
	@Autowired
	private QuestionDao qDao;

	@Override
	public List<Question> findAllQuestions() {
		List<Question> list = qDao.findAllQuestions();
		return list;
	}

	@Override
	public List<Question> addQuestion() {
		List<Question> list = qDao.addQuestion();
		return list;
	}

	

}


