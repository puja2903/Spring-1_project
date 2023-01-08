package com.D_tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.D_tech.entity.Management;


//department repo extending JpaRepository
public interface ManagementRepository extends JpaRepository<Management, Integer>{
	
	@Query("select m from Management m where m.mname = ?1")
	List<Management> getMname(String mname);
	
	@Query("select m from Management m where m.mgender = ?1")
	List<Management> getMgender(String mgender);
	
	
	@Query("select m from Management m where m.mphone = ?1")
	Management getMphone(long mphone);
	
	@Query("select m from Management m where m.memail = ?1")
	List<Management> getMemail(String memail);
	
//	@Query("select m from Management m where m.maadhaar = ?1")
	//Management getMaadhaar(long maadhaar);
	
	

	@Query("select m from Management m where m.mcity = ?1")
	List<Management> getMcity(String mcity);
	
	@Query("select m from Management m where m.msalary = ?1")
	List<Management> getMsalary(long msalary);
	
}
