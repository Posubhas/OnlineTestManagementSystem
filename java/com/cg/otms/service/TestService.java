package com.cg.otms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.otms.dao.QuestionDao;
import com.cg.otms.dao.TestDao;
import com.cg.otms.entities.Question;
import com.cg.otms.entities.Test;
import com.cg.otms.entities.User;

@Service
@Transactional
@Component
public class TestService {
	@Autowired
	TestDao testDao;
	@Autowired
	QuestionDao questionDao;
	public Test addTest(Test test) {
		return testDao.save(test);
	}
	public Test updateTest(Test test) {
		Optional<Test>op=testDao.findById(test.getTestId());
		Test updatedTest = op.get();
		//Question updatedQuestion = questionDao.findByQuestionId(test.getQuestionId());
		//updatedTest.setCurrentQuestion(updatedQuestion);
		updatedTest.update(test);
		return testDao.save(updatedTest);
	}
	public Test deleteTest(Test test) {
		Optional<Test>op =testDao.findById(test.getTestId());
		Test deleteTest = op.get();
		testDao.delete(test);
		return deleteTest;
		
	}
	//public Test assignTest(Test test) {
	//	Test assignTest = testDao.findByTestId(test.getTestId());
		//User assignTest = userDao.findByUserId(User.getUserId());
	//	return testDao.save(assignTest) ;
	//}

}
