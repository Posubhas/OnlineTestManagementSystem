package com.cg.otms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.otms.dto.UserDetails;
@Repository
public interface UserRegistrationDao extends JpaRepository<UserDetails, String> {

}
