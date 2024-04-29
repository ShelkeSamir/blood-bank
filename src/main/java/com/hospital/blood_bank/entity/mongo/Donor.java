package com.hospital.blood_bank.entity.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import com.hospital.blood_bank.entity.BaseEntity;

import lombok.Data;

@Data
@Document(collation = "donor")
public class Donor extends BaseEntity {

}
