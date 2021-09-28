package com.cg.otms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.otms.entities.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Long> {
}
