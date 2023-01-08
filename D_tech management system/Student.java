package com.D_tech.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please Enter your firstname")
	@Size(min = 3, message = "firstname should have atleast 3 characters")
	private String sfname;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please Enter your lastname")
	@Size(min = 3, message = " surname should have atleast 3 characters")
	private String slname;
	
	
	@Min(value=18, message = "Age should not be less than 18")
	@Max(value=30, message = "Age should not be greater than 30")
	@Column(length = 2, nullable = false)
	@NotNull(message = "please Enter your age")
	private int sage;
	
	
	@Column(length = 6, nullable = false)
	@Size(min = 4, message = "gender should be male/female/other")
	@NotBlank(message = "please Enter your gender")
	private String sgender;
	
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "please Enter your email id")
	@Email
	private String semail;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "please Enter your phone number")
	private long sphone;
	
	
	@Column(length = 50, nullable = false)
	@Size(min = 4, message = "address should have atleast 4 characters")
	@NotBlank(message = "please Enter your address")
	private String saddress;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please Enter your highest education qualification")
	private String squalification;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="managementid", referencedColumnName = "mid")
	@JsonBackReference
	private Management management;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid,
			@NotBlank(message = "please Enter your firstname") @Size(min = 3, message = "firstname should have atleast 3 characters") String sfname,
			@NotBlank(message = "please Enter your lastname") @Size(min = 3, message = " surname should have atleast 3 characters") String slname,
			@Min(value = 18, message = "Age should not be less than 18") @Max(value = 30, message = "Age should not be greater than 30") @NotNull(message = "please Enter your age") int sage,
			@Size(min = 4, message = "gender should be male/female/other") @NotBlank(message = "please Enter your gender") String sgender,
			@NotBlank(message = "please Enter your email id") @Email String semail,
			@NotNull(message = "please Enter your phone number") long sphone,
			@Size(min = 4, message = "address should have atleast 4 characters") @NotBlank(message = "please Enter your address") String saddress,
			@NotBlank(message = "please Enter your highest education qualification") String squalification,
			Management management) {
		super();
		this.sid = sid;
		this.sfname = sfname;
		this.slname = slname;
		this.sage = sage;
		this.sgender = sgender;
		this.semail = semail;
		this.sphone = sphone;
		this.saddress = saddress;
		this.squalification = squalification;
		this.management = management;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfname=" + sfname + ", slname=" + slname + ", sage=" + sage + ", sgender="
				+ sgender + ", semail=" + semail + ", sphone=" + sphone + ", saddress=" + saddress + ", squalification="
				+ squalification + ", management=" + management + "]";
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSfname() {
		return sfname;
	}


	public void setSfname(String sfname) {
		this.sfname = sfname;
	}


	public String getSlname() {
		return slname;
	}


	public void setSlname(String slname) {
		this.slname = slname;
	}


	public int getSage() {
		return sage;
	}


	public void setSage(int sage) {
		this.sage = sage;
	}


	public String getSgender() {
		return sgender;
	}


	public void setSgender(String sgender) {
		this.sgender = sgender;
	}


	public String getSemail() {
		return semail;
	}


	public void setSemail(String semail) {
		this.semail = semail;
	}


	public long getSphone() {
		return sphone;
	}


	public void setSphone(long sphone) {
		this.sphone = sphone;
	}


	public String getSaddress() {
		return saddress;
	}


	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}


	public String getSqualification() {
		return squalification;
	}


	public void setSqualification(String squalification) {
		this.squalification = squalification;
	}


	public Management getManagement() {
		return management;
	}


	public void setManagement(Management management) {
		this.management = management;
	}
	
}
