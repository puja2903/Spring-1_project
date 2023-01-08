package com.D_tech.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.D_tech.entity.Login;
import com.D_tech.repository.LoginRepository;
import com.D_tech.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository lrepo;

	@Override
	public Login loginU(String userName, String password) {
		
		Login user = lrepo.findByUserNameAndPassword(userName, password);
		return user;
	}

}
