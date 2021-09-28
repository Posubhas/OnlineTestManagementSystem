package com.cg.otms.service;

import com.cg.otms.dto.CreateAdminRequest;
import com.cg.otms.entities.Admin;

public interface IAdminService {

	Admin add(CreateAdminRequest request);

	Admin findById(Long id);

}
