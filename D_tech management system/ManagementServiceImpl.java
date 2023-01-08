package com.D_tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.D_tech.entity.Management;
import com.D_tech.exception.ManagementNotFoundException;
import com.D_tech.repository.ManagementRepository;
import com.D_tech.service.ManagementService;

//implementing all method of DepartmentService
@Service
public class ManagementServiceImpl implements ManagementService{
	
	@Autowired
	ManagementRepository mrepo;

	
	//saving Department details using save() of jpaRepository
	@Override
	public Management saveManage(Management manage) {
		
		return mrepo.save(manage);
	}

	
	//fetching all Department details using finalAll() of JpaRepository
	@Override
	public List<Management> getAllManage() {

		return mrepo.findAll();
	}

	
	//fetching Department details based on id using findById() of JpaRepository, if not found throw exception
	@Override
	public Management getManageById(int mid) {
		
		return mrepo.findById(mid).orElseThrow(() -> new ManagementNotFoundException("no Management exists in table"));
	}

	
	//fetching Department details based on id using findById() of JpaRepository, if not found throw exception
	//& update any contact details of Department
	@Override
	public Management updateManageById(Management manage, int mid) {
		
		Management newmanage = mrepo.findById(mid).orElseThrow(() -> new ManagementNotFoundException("no Management exists in table"));

		// updated value
		//newmanage.setMid(manage.getMid());
		newmanage.setMname(manage.getMname());
		newmanage.setMgender(manage.getMgender());
		newmanage.setMphone(manage.getMphone());
		newmanage.setMemail(manage.getMemail());
		//newmanage.setMAadhaar(manage.getMAadhaar());
		newmanage.setMcity(manage.getMcity());
		newmanage.setMsalary(manage.getMsalary());
		mrepo.save(newmanage);
		return newmanage;

	}

	
	//deleting Department details based on id using findById() of JpaRepository, if not found throw exception
	@Override
	public void deleteManageById(int mid) {
		
		mrepo.findById(mid).orElseThrow(() -> new ManagementNotFoundException("no Management exists in table"));
		mrepo.deleteById(mid);
		
	}

	
	//fetching all Department details using getDname() of JpaRepository
	@Override
	public List<Management> getMname(String mname) {
		
		return mrepo.getMname(mname);
	}

	
	//fetching Department details using getDphone() of JpaRepository
	@Override
	public Management getMphone(long mphone) {
		
		return mrepo.getMphone(mphone);
	}

	
	//fetching all Department details using getDcity() of JpaRepository
	@Override
	public List<Management> getMcity(String mcity) {
		
		return mrepo.getMcity(mcity);
	}


	@Override
	public List<Management> getMgender(String mgender) {
		
		return mrepo.getMgender(mgender);
	}


	@Override
	public List<Management> getMemail(String memail) {
		
		return mrepo.getMemail(memail);
	}


//	@Override
//	public Management getMaadhaar(long maadhaar) {
//		return mrepo.getMaadhaar(maadhaar);
//	}


	@Override
	public List<Management> getMsalary(long msalary) {
		
		return mrepo.getMsalary(msalary);
	}

}
