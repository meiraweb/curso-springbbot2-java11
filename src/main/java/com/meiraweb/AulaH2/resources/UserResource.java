package com.meiraweb.AulaH2.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meiraweb.AulaH2.entities.User;


@RestController
@RequestMapping (value = "/users")


public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll()
	{
		User u = new User(1L,"Adilson", "Adilson@teste.com", "947464079", "123456" );
		return ResponseEntity.ok().body(u);
	}	

}
