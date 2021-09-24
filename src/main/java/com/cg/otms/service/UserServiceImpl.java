package com.cg.otms.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.otms.dao.UserDao;
import com.cg.otms.dto.TestDetails;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao uDao;

	@Override
	public TestDetails addTest() {

		return uDao.addTest();
	}

}

