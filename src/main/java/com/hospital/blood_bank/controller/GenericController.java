package com.hospital.blood_bank.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.hospital.blood_bank.entity.BaseEntity;
import com.hospital.blood_bank.services.GenericService;

public class GenericController<T extends BaseEntity, K> {

	GenericService<T, K> genericService;

	public GenericController(GenericService<T, K> genericService) {
		super();
		this.genericService = genericService;
	}

	public ResponseEntity<T> create(@RequestBody T t) {
		try {

			List<T> allData = genericService.getList();
			if (!allData.isEmpty()) {
				return new ResponseEntity<>(allData.get(0), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
