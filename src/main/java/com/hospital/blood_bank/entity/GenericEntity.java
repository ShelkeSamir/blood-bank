package com.hospital.blood_bank.entity;

import com.hospital.blood_bank.entity.mongo.Sex;

import lombok.Data;

@Data
public class GenericEntity extends BaseEntity {

	private String name;
	private String surname;
	private Integer age;
	private Sex sex;

}
