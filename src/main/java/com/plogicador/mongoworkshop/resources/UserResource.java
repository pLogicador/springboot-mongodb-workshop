package com.plogicador.mongoworkshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plogicador.mongoworkshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User bjarne = new User("1", "Bjarne Stroustrup", "bjarnestr@gmail.com");
		User thomas = new User("2", "Thomas Cormen", "thomashcormen@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(bjarne, thomas));
		return ResponseEntity.ok().body(list);
	}
}
