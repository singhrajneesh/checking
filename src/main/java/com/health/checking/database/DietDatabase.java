package com.health.checking.database;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.health.checking.modal.DietModal;



public interface DietDatabase extends MongoRepository<DietModal,String>{
	
	DietModal findByParameter(String parameter);

}
