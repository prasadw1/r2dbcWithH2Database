package com.sample.r2dbc.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.r2dbc.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {
	  
	  @Query("SELECT * FROM user WHERE name = :name") Flux<User>
	  findByName(String name);
	 
	
}
