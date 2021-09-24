package com.cg.otms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.otms.dao.QuestionDao;
import com.cg.otms.dao.TestDao;
import com.cg.otms.entities.Question;
import com.cg.otms.entities.Test;

@Service
public class TestService {
	@Autowired
	TestDao testDao;
	@Autowired
	QuestionDao questionDao;
	public Test addTest(Test test) {
		return testDao.save(test);
	}
	public Test updateTest(Test test) {
		Test updatedTest = testDao.findByTestId(test.getTestId());
		Question updatedQuestion = questionDao.findByQuestionId(test.getCurrentQuestion().getQuestionId());
		updatedTest.setCurrentQuestion(updatedQuestion);
		return testDao.save(updatedTest);
	}
	public String deleteTest(Test test) {
		testDao.deleteByTestId(test.getTestId());
		return "Test Deleted : "+test.getTestId();
	}

}
