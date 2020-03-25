package com.sample.r2dbc;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.r2dbc.model.User;
import com.sample.r2dbc.repository.UserRepository;

@SpringBootApplication
public class R2dbcApplication {

	// private static final Logger log =
	// LoggerFactory.getLogger(R2dbcApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(R2dbcApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {

		return (args) -> { // save a few customers

			
			  List<User> l = new ArrayList<User>(); for(int i = 0;i<10000;i++) { l.add(new
			  User("A", i)); } repository.saveAll(l).blockLast(Duration.ofSeconds(10));
			 
			
			/*
			 * repository.saveAll(Arrays.asList(new User("Prasad", 10000), new User("Rohit",
			 * 20000), new User("Ajit", 30000), new User("Avinash",
			 * 40000))).blockLast(Duration.ofSeconds(10));
			 */ 
			

			System.out.println("-------------------------------");
			repository.findAll().doOnNext(user -> {
				System.out.println(user.toString());
			}).blockFirst(Duration.ofSeconds(10));

			System.out.println("");

			
			repository.findById(1).doOnNext(user -> {
				System.out.println("Customer found with findById(1):");
				System.out.println("--------------------------------");
				System.out.println(user.toString());
				System.out.println("");
			}).block(Duration.ofSeconds(10));

			
			System.out.println("USer found with findByLastName('Prasad'):");
			System.out.println("--------------------------------------------");

			repository.findByName("Prasad").doOnNext(bauer -> {
				System.out.println(bauer.toString());
			}).blockLast(Duration.ofSeconds(10));

			System.out.println("");
		};
	}

}
