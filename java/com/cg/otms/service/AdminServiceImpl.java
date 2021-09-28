package com.cg.otms.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.otms.dto.CreateAdminRequest;
import com.cg.otms.entities.Admin;
import com.cg.otms.entities.AppUser;
import com.cg.otms.exception.AdminNotFoundException;
import com.cg.otms.repositories.IAdminRepository;
import com.cg.otms.repositories.IUserRepository;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminRepository adminRepo;

	@Autowired
	private IUserRepository userRepo;

	@Override
	public Admin add(CreateAdminRequest request) {
		Admin admin = new Admin();
		admin.setFirstName(request.getFirstName());
		admin.setLastName(request.getLastName());
		AppUser user = new AppUser();
		user.setUsername(request.getUsername());
		user.setPassword(request.getPassword());
		Set<String> roles = new HashSet<>();
		roles.add("admin");
		user.setRoles(roles);
		user = userRepo.save(user);
		admin.setUser(user);
		return adminRepo.save(admin);
	}

	@Override
	public Admin findById(Long id) {
		Optional<Admin> optional = adminRepo.findById(id);
		if (!optional.isPresent()) {
			throw new AdminNotFoundException("admin not found");
		}
		return optional.get();
	}
}
