package com.health.checking.database;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.health.checking.modal.HealthModal;

public interface HealthDatabase extends MongoRepository<HealthModal, String>{
	HealthModal findByEmailId(String emailId);
	List<HealthModal> findAll();
	Boolean existsByEmailId(String emailId);
}
