package com.kornofuli.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kornofuli.blog.model.Post;
import com.kornofuli.blog.repository.PostRepository;

@RestController
@RequestMapping(value="/blog")
public class PostController {
	@Autowired
	private PostRepository postRepo;

	public PostController(PostRepository postRepo) {
		this.postRepo = postRepo;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Post> getAll(){
		return postRepo.findAll();
	}

}
