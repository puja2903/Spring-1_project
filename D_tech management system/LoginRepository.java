package com.D_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.D_tech.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	
	public Login findByUserNameAndPassword(String userName, String password);

}
