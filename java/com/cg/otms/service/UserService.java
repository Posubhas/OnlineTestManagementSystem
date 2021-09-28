package com.cg.otms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.otms.entities.Test;
import com.cg.otms.entities.User;

//import com.cg.otms.dto.TestDetails;

public interface UserService {
	public User assignTest(int userId, int testId);

}
