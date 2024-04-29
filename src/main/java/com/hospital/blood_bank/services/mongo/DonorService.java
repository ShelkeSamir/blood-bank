package com.hospital.blood_bank.services.mongo;

import org.springframework.stereotype.Service;

import com.hospital.blood_bank.entity.mongo.Donor;
import com.hospital.blood_bank.repository.GenericRepository;
import com.hospital.blood_bank.services.GenericService;

@Service
public class DonorService extends GenericService<Donor, Long> {

	public DonorService(GenericRepository<Donor> genericRepository) {
		super(genericRepository);
		// TODO Auto-generated constructor stub
	}

}
