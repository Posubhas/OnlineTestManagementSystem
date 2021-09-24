package com.cg.otms.dao;
import java.util.List;

import com.cg.otms.entities.Question;


import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question, Integer>{
	List<Question> findAllQuestions();

	List<Question> addQuestion();

}
