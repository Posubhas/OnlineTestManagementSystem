package com.cg.otms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.Test;

public interface TestDao extends JpaRepository<Test,Integer>{
	

}
