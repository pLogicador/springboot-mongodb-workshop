package com.plogicador.mongoworkshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.plogicador.mongoworkshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	
}
