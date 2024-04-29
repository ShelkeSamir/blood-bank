package com.hospital.blood_bank.services.mongo;

import org.springframework.stereotype.Service;

import com.hospital.blood_bank.entity.mongo.BankBlood;
import com.hospital.blood_bank.repository.GenericRepository;
import com.hospital.blood_bank.services.GenericService;

@Service
public class BankBloodService extends GenericService<BankBlood, Long> {

	public BankBloodService(GenericRepository<BankBlood> genericRepository) {
		super(genericRepository);
		// TODO Auto-generated constructor stub
	}

}
