package com.cg.otms.service;

import com.cg.otms.dto.UserDetails;

public interface UserRegisterService {

	UserDetails findByName(UserDetails userDetails);

	UserDetails register(UserDetails uDetails);

}
