package com.DocterTransactional.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DocterTransactional.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

}
