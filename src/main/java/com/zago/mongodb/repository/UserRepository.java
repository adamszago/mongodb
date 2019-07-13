package com.zago.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zago.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
