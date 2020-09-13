package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.Recruiter;
import com.job.repo.RecruiterDAL;

@CrossOrigin(origins = "*")
@RestController
public class RecruiterController {
	@Autowired
	RecruiterDAL recruiter;
	@GetMapping("")
	public String welcome() {
		return "Hey there! Welcome to JobHunt API";
	}
	@PostMapping("/api/v1/recruiters")
	public Recruiter createRecruiter(@RequestBody Recruiter rec) {
		return recruiter.addNew(rec);
	}
	@GetMapping("/api/v1/recruiters/{id}")
	public Recruiter getRecruiterById(@PathVariable String id) {
		return recruiter.findById(id);
	}
}
