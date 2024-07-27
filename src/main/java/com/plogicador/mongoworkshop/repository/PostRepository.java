package com.plogicador.mongoworkshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.plogicador.mongoworkshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	
}
