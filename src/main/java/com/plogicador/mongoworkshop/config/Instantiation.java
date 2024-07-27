package com.plogicador.mongoworkshop.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.plogicador.mongoworkshop.domain.Post;
import com.plogicador.mongoworkshop.domain.User;
import com.plogicador.mongoworkshop.repository.PostRepository;
import com.plogicador.mongoworkshop.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User thomas = new User(null, "Thomas Cormen", "thomascormen@gmail.com");
		User james = new User(null, "James Stewart", "jamesstr@gmail.com");
		User eleanor = new User(null, "Eleanor Grey", "eleanor@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Let's travel", "I'm traveling to São Paulo, hugs!", thomas);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Good morning", "I woke up very excited today!", thomas);

		userRepository.saveAll(Arrays.asList(thomas, james, eleanor));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
