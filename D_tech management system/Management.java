package com.D_tech.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity

public class Management {
	
	@Id
	private int mid;
	
	@Column(length = 20, nullable = false)
	@Size(min = 2, message = "name should have atleast 3 characters")
	@NotBlank(message = "please Enter your name")
	private String mname;
	
	@Column(length = 6, nullable = false)
	@Size(min = 4, message = "gender should be male/female/other")
	@NotBlank(message = "please Enter your gender")
	private String mgender;
	
//    @Column(length = 20, nullable = false)
//	@Size(min = 3, message = "manager name should have atleast 3 characters")
//	@NotBlank(message = "please Enter your manager name")
//	private String manager;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "please Enter employee phone number")
	private long mphone;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "please Enter employee email id")
	@Email
	private String memail;
	
//	@Column(length = 15, nullable = false, unique = true)
//	@NotNull(message = "please Enter your Aadhaar number")
//	private long mAadhaar;
	
	@Column(length = 20, nullable = false)
	@Size(min = 3, message = "city should have atleast 3 characters")
	@NotBlank(message = "please Enter your city")
	private String mcity;
	
	@Column(length = 10, nullable = false)
	@NotNull(message = "please Enter your salary")
	private double msalary;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "management", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Student> student;


	public Management() {
		super();
	}


	public Management(int mid,
			@Size(min = 2, message = "name should have atleast 3 characters") @NotBlank(message = "please Enter your name") String mname,
			@Size(min = 4, message = "gender should be male/female/other") @NotBlank(message = "please Enter your gender") String mgender,
			@NotNull(message = "please Enter employee phone number") long mphone,
			@NotBlank(message = "please Enter employee email id") @Email String memail,
			@Size(min = 3, message = "city should have atleast 3 characters") @NotBlank(message = "please Enter your city") String mcity,
			@NotNull(message = "please Enter your salary") double msalary, List<Student> student) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mgender = mgender;
		this.mphone = mphone;
		this.memail = memail;
		this.mcity = mcity;
		this.msalary = msalary;
		this.student = student;
	}


	@Override
	public String toString() {
		return "Management [mid=" + mid + ", mname=" + mname + ", mgender=" + mgender + ", mphone=" + mphone
				+ ", memail=" + memail + ", mcity=" + mcity + ", msalary=" + msalary + ", student=" + student + "]";
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getMgender() {
		return mgender;
	}


	public void setMgender(String mgender) {
		this.mgender = mgender;
	}


	public long getMphone() {
		return mphone;
	}


	public void setMphone(long mphone) {
		this.mphone = mphone;
	}


	public String getMemail() {
		return memail;
	}


	public void setMemail(String memail) {
		this.memail = memail;
	}


	public String getMcity() {
		return mcity;
	}


	public void setMcity(String mcity) {
		this.mcity = mcity;
	}


	public double getMsalary() {
		return msalary;
	}


	public void setMsalary(double msalary) {
		this.msalary = msalary;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
}
