package com.cg.otms.service;


import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Array;
import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.otms.dao.QuestionDao;
import com.cg.otms.entities.Question;
@Service
public class QuestionServiceImpl {
	@Autowired
	private QuestionDao qDao;

	public List<Question> findAllQuestions() {
		List<Question> list = qDao.findAll();
		return list;
	}

	public Question addQuestion(Question question) {
		return qDao.save(question);
		
	}
	public Question updateQuestion(Question question) {
		//Question updatedQuestion = qDao.findByQuestionId(question.getQuestionId());
		Optional<Question>op=qDao.findById(question.getQuestionId());
		Question updatedQuestion = op.get(); 
		updatedQuestion.setChosenAnswer(question.getChosenAnswer());
		updatedQuestion.setQuestionAnswer(question.getQuestionAnswer());
		updatedQuestion.setQuestionOptions(question.getQuestionOptions());
		updatedQuestion.setQuestionTitle(question.getQuestionTitle());
		return qDao.save(updatedQuestion);
	}
	public String deleteQuestion(Question question) {
		//qDao.deleteByQuestionId(question.getQuestionId());
		qDao.deleteById(question.getQuestionId());
		return "Question Deleted:"+question.getQuestionId();
	}
		
	}


