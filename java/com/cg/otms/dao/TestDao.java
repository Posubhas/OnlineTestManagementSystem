package com.cg.otms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.entities.Test;

@Repository
public interface TestDao extends JpaRepository<Test, Integer> {

}
