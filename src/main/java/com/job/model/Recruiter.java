package com.job.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Recruiter {
@Id
@Generated(value = "com.acme.generator.CodeGen")
String id;
String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public List<Posting> getPostedJobs() {
	return PostedJobs;
}
public void setPostedJobs(List<Posting> postedJobs) {
	PostedJobs = postedJobs;
}
String email;
String companyName;
@DBRef(lazy=true)
List<Posting> PostedJobs=new ArrayList<Posting>();
}
