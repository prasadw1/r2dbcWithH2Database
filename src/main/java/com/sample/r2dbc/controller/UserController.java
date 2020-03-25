package com.sample.r2dbc.controller;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.r2dbc.model.User;
import com.sample.r2dbc.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController

@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
public Flux<User> getData() {
	return userRepository.findAll().doOnNext(user -> System.out.println(user.getSalary())).delayElements(Duration.ofSeconds(2)).doOnComplete(()-> System.out.println("Completed"));
	//return userRepository.findAll();
	}

@GetMapping(value="/{id}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
public Mono<User> getDataById(@PathVariable Integer id) {
	return userRepository.findById(id);
	}
}
 