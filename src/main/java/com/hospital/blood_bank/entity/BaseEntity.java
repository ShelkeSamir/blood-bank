package com.hospital.blood_bank.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BaseEntity<T> {

	private Long Id;
	private LocalDate creation_date;
	private LocalDate modification_date;
}
