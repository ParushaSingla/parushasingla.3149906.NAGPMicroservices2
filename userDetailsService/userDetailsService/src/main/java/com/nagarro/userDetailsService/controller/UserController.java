package com.nagarro.userDetailsService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nagarro.userDetailsService.dao.UserServiceDao;
import com.nagarro.userDetailsService.model.User;

@RestController
@Component
@ComponentScan("com.nagarro.userService")
public class UserController {

	@Autowired
	UserServiceDao userServiceDao;
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

	
	@GetMapping("user/{id}")
	public User userDetails(@PathVariable("id") int id) {
//		ResponseEntity<ListOfOrder> responseEntity=new RestTemplate().getForEntity("http://localhost:8080/order/{id}", ListOfOrder.class, id);
//		ListOfOrder response=responseEntity.getBody();
//	    System.out.println(response);
		User user = userServiceDao.getUserDetails(id);
		if (user == null) {
			return user;
		} else {
			return user;
		}
	}
}
