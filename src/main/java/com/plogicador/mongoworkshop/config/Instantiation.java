package com.plogicador.mongoworkshop.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.plogicador.mongoworkshop.domain.Post;
import com.plogicador.mongoworkshop.domain.User;
import com.plogicador.mongoworkshop.dto.AuthorDTO;
import com.plogicador.mongoworkshop.dto.CommentDTO;
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
		userRepository.saveAll(Arrays.asList(thomas, james, eleanor));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Let's travel", "I'm traveling to São Paulo, hugs!", new AuthorDTO(thomas));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Good morning", "I woke up very excited today!", new AuthorDTO(thomas));
		
		CommentDTO c1 = new CommentDTO("Have a good trip, man!", sdf.parse("21/03/2018"), new AuthorDTO(james));
		CommentDTO c2 = new CommentDTO("Enjoy", sdf.parse("22/03/2018"), new AuthorDTO(eleanor));
		CommentDTO c3 = new CommentDTO("I hope you have a great weekend", sdf.parse("23/03/2018"), new AuthorDTO(james));
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		thomas.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(thomas);
	}

}
