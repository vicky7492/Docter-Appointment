package com.DocterTransactional.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.hibernate.annotations.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DocterTransactional.controller.Form.AppointmentForm;
import com.DocterTransactional.model.Appointment;
import com.DocterTransactional.model.Patient;
import com.DocterTransactional.repo.AppointmentRepo;
import com.DocterTransactional.repo.PatientRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class BookAppointmentService {
	
	@Autowired
	private AppointmentRepo appointmentRepo;
	
	@Autowired
	private PatientRepo patientRepo;
	
	
	public String bookAppointment(AppointmentForm appointmentForm)
	{
	 
	Patient patient = new ObjectMapper().convertValue(appointmentForm, Patient.class);
	Long patientNumber = patientRepo.save(patient).getPatientNumber();
	
	System.out.println("Patient Data saved Successfully added");
	
	
	Appointment appointment = new Appointment(new Date(System.currentTimeMillis()),101L, patientNumber);
	
	Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();
	
	return "Appointment confirm,  Please be on time" +appointmentNumber;
}
}
