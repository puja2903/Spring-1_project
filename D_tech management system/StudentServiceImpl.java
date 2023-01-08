package com.D_tech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.D_tech.entity.Student;
import com.D_tech.exception.StudentNotFoundException;
import com.D_tech.repository.StudentRepository;
import com.D_tech.service.StudentService;

//implementing all method of EmployeeService
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository srepo;

	
	//saving Employee details using save() of jpaRepository
	@Override
	public Student saveStu(Student stu) {

		return srepo.save(stu);
	}

	
	//fetching all Employee details using finalAll() of JpaRepository
	@Override
	public List<Student> getAllStu() {

		return srepo.findAll();
	}
	

	//fetching Employee details based on id using findById() of JpaRepository, if not found throw exception
	@Override
	public Student getStuById(int sid) {

		return srepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no student exists in table"));
	}

	
	//fetching employee details based on id using findById() of JpaRepository, if not found throw exception
	//& update any contact details of employee
	@Override
	public Student updateStuById(Student stu, int sid) {
		
		Student newstu = srepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no student exists in table"));

		// updated value
		newstu.setSfname(stu.getSfname());
		newstu.setSlname(stu.getSlname());
		newstu.setSage(stu.getSage());
		newstu.setSgender(stu.getSgender());
		newstu.setSemail(stu.getSemail());
		newstu.setSphone(stu.getSphone());
		newstu.setSaddress(stu.getSaddress());
		newstu.setSqualification(stu.getSqualification());
		srepo.save(newstu);
		return newstu;
	}
	
	
	//deleting employee details based on id using findById() of JpaRepository, if not found throw exception
	@Override
	public void deleteStuById(int sid) {
		
		srepo.findById(sid).orElseThrow(() -> new StudentNotFoundException("no student exists in table"));
		srepo.deleteById(sid);
		
	}

	
	//fetching all Employee details using getEname() of JpaRepository
	@Override
	public List<Student> getSfname(String sfname) {
		
		return srepo.getSfname(sfname);
	}
	@Override
public List<Student> getSlname(String slname) {
		
		return srepo.getSlname(slname);
	}
	
	//fetching all Employee details using getAge() of JpaRepository
		@Override
		public List<Student> getSage(int sage) {
			
			return srepo.getSage(sage);
		}
	
	@Override
	public List<Student> getSgender(String sgender) {
			
			return srepo.getSgender(sgender);
		}




	//fetching Employee details using getPhone() of JpaRepository
	@Override
	public Student getSphone(long sphone) {
		
		return srepo.getSphone(sphone);
	}
	
	@Override
	public List<Student> getSemail(String semail) {
			
			return srepo.getSemail(semail);
		}

	@Override
	public List<Student> getSaddress(String saddress) {
			
			return srepo.getSaddress(saddress);
		}


	
	//fetching all Employee details using getSkill() of JpaRepository
	@Override
	public List<Student> getSqualification(String squalification) {

		return srepo.getSqualification(squalification);
	}



}
