package com.D_tech.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.D_tech.entity.Management;
import com.D_tech.service.ManagementService;

//department controller to handling all rest api incoming request
@RestController
public class ManagementController {
	

	@Autowired
	private ManagementService ms;
	
	//save Department in db table using rest api PostMapping
	@PostMapping("/saveM")
	public ResponseEntity<Management> saveManage(@Valid @RequestBody Management manage){
		return new ResponseEntity<Management>(ms.saveManage(manage), HttpStatus.CREATED);
	}
	
	// fetch Department details from db table using rest api GetMapping
	@GetMapping("/getAllM")
	public List<Management> getAll(){
		return ms.getAllManage();
	}
	
	//fetch Department details from db table using rest api GetMapping based on id
	@GetMapping("/getM/{mid}")
	public ResponseEntity<Management> getM(@PathVariable("mid") int mid){
		return new ResponseEntity<Management>(ms.getManageById(mid),HttpStatus.OK);
	}
	
	//update Department details in db table using rest api PutMapping based on id
	@PutMapping("/updateM/{mid}")
	public ResponseEntity<Management> updateManage(@PathVariable("mid") int mid, @RequestBody Management manage){
			return new ResponseEntity<Management>(ms.updateManageById(manage, mid), HttpStatus.OK);
	}
		
	//delete Department details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteM/{mid}")
	public ResponseEntity<String> deleteManage(@PathVariable("mid") int mid){
		ms.deleteManageById(mid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
	
	//fetch Department details from db table using rest api GetMapping based on name
	@GetMapping("/getMn/{mname}")
	public List<Management> getMname(@PathVariable String mname){
		return ms.getMname(mname);
	}
	
	//fetch Department details from db table using rest api GetMapping based phone number
	@GetMapping("/getMph/{mphone}")
	public Management getMphone(@PathVariable long mphone){
		return ms.getMphone(mphone);
	}
	
	//fetch Department details from db table using rest api GetMapping based on city
	@GetMapping("/getMcity/{mcity}")
	public List<Management> getMcity(@PathVariable String mcity){
		return ms.getMcity(mcity);
	}
	
	//fetch adhaar
//	@GetMapping("/getMA/{maadhaar}")
//	public Management getMaadhaar(@PathVariable long maadhaar){
//		return ms.getMaadhaar(maadhaar);
//	}
	
	@GetMapping("/getMemail/{memail}")
	public List<Management> getMemail(@PathVariable String memail){
		return ms.getMemail(memail);
	}
	
	@GetMapping("/getMs/{msalary}")
	public List<Management> getMsalary(@PathVariable long msalary){
		return ms.getMsalary(msalary);
	}

}
