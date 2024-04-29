package com.hospital.blood_bank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hospital.blood_bank.entity.BaseEntity;

public interface GenericRepository<T extends BaseEntity> extends MongoRepository<T, Long> {

}
