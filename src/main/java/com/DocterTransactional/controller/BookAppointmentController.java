package com.DocterTransactional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DocterTransactional.controller.Form.AppointmentForm;
import com.DocterTransactional.service.BookAppointmentService;

@RestController
@RequestMapping("/patient")
public class BookAppointmentController {
	
	@Autowired
	private BookAppointmentService bookAppointmentService;

	@PostMapping("/addpatient")
	public String bookAppointment(@RequestBody AppointmentForm appointmentform)
	{
		return bookAppointmentService.bookAppointment(appointmentform);
	}
	
	
}
