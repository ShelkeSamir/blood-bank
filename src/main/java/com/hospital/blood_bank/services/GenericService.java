package com.hospital.blood_bank.services;

import java.util.List;

import com.hospital.blood_bank.entity.BaseEntity;
import com.hospital.blood_bank.repository.GenericRepository;

public abstract class GenericService<T extends BaseEntity, K> implements BaseService<T, K> {

	private GenericRepository<T> genericRepository;

	public GenericService(GenericRepository<T> genericRepository) {
		// TODO Auto-generated constructor stub
		this.genericRepository = genericRepository;
	}

	public T save(T t) {
		return genericRepository.save(t);
	}

	public List<T> getList() {
		return genericRepository.findAll();
	}
}
