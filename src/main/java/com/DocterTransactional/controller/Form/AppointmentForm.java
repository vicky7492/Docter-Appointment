package com.DocterTransactional.controller.Form;

public class AppointmentForm {

	private String patientName;
	private String gender;
	private int age;
	private String mobileNo;
	private String address;
	public AppointmentForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentForm(String patientName, String gender, int age, String mobileNo, String address) {
		super();
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
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
	@Override
	public String toString() {
		return "AppointmentForm [patientName=" + patientName + ", gender=" + gender + ", age=" + age + ", mobileNo="
				+ mobileNo + ", address=" + address + "]";
	}
	
	
}
