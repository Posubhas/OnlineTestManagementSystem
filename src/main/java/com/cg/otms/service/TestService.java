package com.cg.otms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.otms.dao.TestDao;
import com.cg.otms.entities.Test;

@Service
public class TestService {
	@Autowired
	TestDao testDao;
	public Test addTest(Test test) {
		return testDao.save(test);
	}

}
