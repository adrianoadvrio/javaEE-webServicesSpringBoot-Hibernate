package com.adrianoadvrio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianoadvrio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
