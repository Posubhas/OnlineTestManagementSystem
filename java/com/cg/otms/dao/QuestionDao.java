package com.cg.otms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.entities.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
