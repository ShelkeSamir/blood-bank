package com.hospital.blood_bank.services;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, K> {
	
    T save(T t);
    List<T> getList();
//    T getOne(K id);
//    void delete(T t);
//    void deleteById(K id);
//    T update(T t,K id);
    
}
