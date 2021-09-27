package com.cg.otms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.otms.dao.TestDao;
import com.cg.otms.dao.UserDao;
import com.cg.otms.entities.Test;
import com.cg.otms.entities.User;

//import com.cg.otms.dto.TestDetails;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao uDao;
	@Autowired
	private TestDao testDao;

	// @Override
	public User assignTest(int userId, int testId) {
		User auser = uDao.findByUserId(userId);
		Optional<Test> op = testDao.findById(testId);
		Test atest = op.get();
		auser.setUserTest(atest);
		return uDao.save(auser);
		// return uDao.save();
	}

}
