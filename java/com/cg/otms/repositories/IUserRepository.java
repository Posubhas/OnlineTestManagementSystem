package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.AppUser;

public interface IUserRepository extends JpaRepository<AppUser, Long> {

	AppUser findByUsername(String username);

}
