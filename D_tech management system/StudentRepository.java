package com.D_tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.D_tech.entity.Student;


//employee repo extending JpaRepository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where s.sfname = ?1")
	List<Student> getSfname(String sfname);
	
	@Query("select s from Student s where s.slname = ?1")
	List<Student> getSlname(String slname);
	
	@Query("select s from Student s where s.sage = ?1")
	List<Student> getSage(int sage);
	
	@Query("select s from Student s where s.sgender = ?1")
	List<Student> getSgender(String sgender);
	
	@Query("select s from Student s where s.semail = ?1")
	List<Student> getSemail(String semail);
	
	@Query("select s from Student s where s.sphone = ?1")
	Student getSphone(long sphone);
	

	@Query("select s from Student s where s.saddress = ?1")
	List<Student> getSaddress(String saddress);
	
	@Query("select s from Student s where s.squalification = ?1")
	List<Student> getSqualification(String squalification);
}
