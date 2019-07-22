package com.zago.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zago.mongodb.domain.Post;
import com.zago.mongodb.domain.User;
import com.zago.mongodb.dto.UserDTO;
import com.zago.mongodb.repository.PostRepository;
import com.zago.mongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj =  repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}
	
	
}
