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

import com.D_tech.entity.Student;
import com.D_tech.service.StudentService;

//user controller to handling all rest api incoming request
@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	//save Employee in db table using rest api PostMapping
	@PostMapping("/saveS")
	public ResponseEntity<Student> saveStu(@Valid @RequestBody Student stu){
		return new ResponseEntity<Student>(ss.saveStu(stu), HttpStatus.CREATED);
	}
	
	// fetch Employee details from db table using rest api GetMapping
	@GetMapping("/getAllS")
	public List<Student> getAll(){
		return ss.getAllStu();
	}
	
	//fetch Employee details from db table using rest api GetMapping based on id
	@GetMapping("/getS/{sid}")
	public ResponseEntity<Student> getS(@PathVariable("sid") int sid){
		return new ResponseEntity<Student>(ss.getStuById(sid),HttpStatus.OK);
	}
	
	//update Employee details in db table using rest api PutMapping based on id
	@PutMapping("/updateS/{sid}")
	public ResponseEntity<Student> updateStu(@PathVariable("sid") int sid, @RequestBody Student stu){
			return new ResponseEntity<Student>(ss.updateStuById(stu, sid), HttpStatus.OK);
	}
		
	//delete Employee details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteS/{sid}")
	public ResponseEntity<String> deleteStu(@PathVariable("sid") int sid){
		ss.deleteStuById(sid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
	
	//fetch Employee details from db table using rest api GetMapping based on name
	@GetMapping("/getSfn/{sfname}")
	public List<Student> getSfname(@PathVariable String sfname){
		return ss.getSfname(sfname);
	}
	
	//fetch Employee details from db table using rest api GetMapping based on name
		@GetMapping("/getSln/{slname}")
		public List<Student> getSlname(@PathVariable String slname){
			return ss.getSlname(slname);
		}
		
		//fetch Employee details from db table using rest api GetMapping based on name
		@GetMapping("/getSa/{sage}")
		public List<Student> getSage(@PathVariable int sage){
			return ss.getSage(sage);
		}
		
		//fetch Employee details from db table using rest api GetMapping based on name
		@GetMapping("/getSg/{sgender}")
		public List<Student> getSgender(@PathVariable String sgender){
			return ss.getSgender(sgender);
		}
		
		//fetch Employee details from db table using rest api GetMapping based on name
		@GetMapping("/getSe/{semail}")
		public List<Student> getSemail(@PathVariable String semail){
			return ss.getSemail(semail);
		}
	
	//fetch Employee details from db table using rest api GetMapping based on phone number
	@GetMapping("/getSPh/{sphone}")
	public Student getSphone(@PathVariable long sphone){
		return ss.getSphone(sphone);
	}

	//fetch Employee details from db table using rest api GetMapping based on address
	@GetMapping("/getSAdr/{saddress}")
	public List<Student> getSaddress(@PathVariable String saddress){
		return ss.getSaddress(saddress);
	}
	
	//fetch Employee details from db table using rest api GetMapping based on address
		@GetMapping("/getSq/{squalification}")
		public List<Student> getSqualification(@PathVariable String squalification){
			return ss.getSqualification(squalification);
		}
	
}
