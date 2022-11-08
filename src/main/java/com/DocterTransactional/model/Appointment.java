package com.DocterTransactional.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long appointmentNumber;
	private Date date;
	private Long docterName;
	private Long patientNumber;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Date date, Long docterName, Long patientNumber) {
		super();
		this.appointmentNumber = appointmentNumber;
		this.date = date;
		this.docterName = docterName;
		this.patientNumber = patientNumber;
	}
	public Long getAppointmentNumber() {
		return appointmentNumber;
	}
	public void setAppointmentNumber(Long appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDocterName() {
		return docterName;
	}
	public void setDocterName(Long docterName) {
		this.docterName = docterName;
	}
	public Long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		this.patientNumber = patientNumber;
	}
	
	

}
