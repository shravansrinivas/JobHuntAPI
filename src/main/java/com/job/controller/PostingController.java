package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.Posting;
import com.job.repo.PostingDAL;


@CrossOrigin(origins = "*")
@RestController
public class PostingController {
	@Autowired
	PostingDAL postings;
	
	@GetMapping("/api/v1/postings/{id}")
	public Posting getPostById(@RequestParam String id) {
		return postings.getPostById(id);
	}
	
	@GetMapping("/api/v1/postings/search/{key}")
	public List<Posting> getPostsByKey(@RequestParam String key) {
		return postings.searchPostByKeyword(key);
	}
	
	@PostMapping("/api/v1/postings")
	public Posting addPosting(Posting p) {
		return postings.addPost(p);
	}
	
}
