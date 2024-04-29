package com.hospital.blood_bank.entity.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import com.hospital.blood_bank.entity.GenericEntity;

import lombok.AllArgsConstructor;

@Document(collation = "patient")
@AllArgsConstructor
public class Patient extends GenericEntity {

}
