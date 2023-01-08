package com.D_tech.service;

import java.util.List;

import com.D_tech.entity.Student;


//abstract method for performing CRUD on Employee entity
public interface StudentService {
	
	//saving details of employee
	Student saveStu(Student stu);
	
	//getting all details of employee 
	List<Student> getAllStu();
	
	//getting details of employee based on eid
	Student getStuById(int sid);
	
	//getting details of employee based on eid & change mentioned details 
	Student updateStuById(Student stu, int sid);
	
	//getting details of employee based on eid & delete mentioned employee
	void deleteStuById(int sid);
	
	//getting all details of employee based on ename
	 List<Student> getSfname(String sfname);
	 
	 //last name
	 List<Student> getSlname(String slname);
	
	//getting all details of employee based on age
	 List<Student> getSage(int sage);
	 
	 //gender
	 List<Student> getSgender(String sgender);
	
	//getting details of employee based on phone number
	 Student getSphone(long sphone);
	
	//email
	List<Student> getSemail(String semail);

	//address
	List<Student> getSaddress(String saddress);
	
	//qualification
	List<Student> getSqualification(String squalification);
}