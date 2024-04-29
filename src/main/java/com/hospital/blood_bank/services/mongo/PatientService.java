package com.hospital.blood_bank.services.mongo;

import org.springframework.stereotype.Service;

import com.hospital.blood_bank.entity.mongo.Patient;
import com.hospital.blood_bank.repository.GenericRepository;
import com.hospital.blood_bank.services.GenericService;

@Service
public class PatientService extends GenericService<Patient, Long> {

	public PatientService(GenericRepository<Patient> genericRepository) {
		super(genericRepository);
		// TODO Auto-generated constructor stub
	}

}
