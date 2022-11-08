package com.DocterTransactional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientNumber;
	private String patientName;
	private String gender;
	private int age;
	private String mobileNo;
	private String address;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long patientNumber, String patientName, String gender, int age, String mobileNo, String address) {
		super();
		this.patientNumber = patientNumber;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public Long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
