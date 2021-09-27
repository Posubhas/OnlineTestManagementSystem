package com.cg.otms.dao;
import java.util.List;

import com.cg.otms.entities.Question;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
	//List<Question> findAllQuestions();

	//Question findByQuestionId(int questionId);

	//void deleteByQuestionId(int questionId);

}
