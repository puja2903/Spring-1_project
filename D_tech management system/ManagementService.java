package com.D_tech.service;

import java.util.List;

import com.D_tech.entity.Management;

//abstract method for performing CRUD on Department entity
public interface ManagementService {

	//saving details of Department
    Management saveManage(Management manage);

	//getting all details of Department
    List<Management> getAllManage();

	//getting details of Department based on did
    Management getManageById(int mid);

	//getting details of Department based on did & change mentioned details
    Management updateManageById(Management manage, int mid);

	//getting details of Department based on did & delete mentioned Department
	void deleteManageById(int mid);

	//getting all details of Department based on department name
	List<Management> getMname(String mname);
	
	//gender
	List<Management> getMgender(String mgender);

	//getting details of Department based on phone number
	Management getMphone(long mphone);
	
	//email
	List<Management> getMemail(String memail);
	
	//adhaar
	//Management getMaadhaar(long maadhaar);

	//getting all details of Department based on department city
	 List<Management> getMcity(String mcity);
	 
	 //salary
	List< Management> getMsalary(long msalary);

}
