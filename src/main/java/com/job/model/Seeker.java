package com.job.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Seeker {
	@Id
	@Generated(value = "com.acme.generator.CodeGen")
	String id;
	String name;
	String email;
	@DBRef(lazy=true)
	List<String> skills=new ArrayList<String>();
	@DBRef(lazy=true)
	List<Education> eduDetails=new ArrayList<Education>();
	@DBRef(lazy=true)
	List<Certification> certDetails=new ArrayList<Certification>();
	@DBRef(lazy=true)
	List<Posting> appliedPostings=new ArrayList<Posting>();
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
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public List<Education> getEduDetails() {
		return eduDetails;
	}
	public void setEduDetails(List<Education> eduDetails) {
		this.eduDetails = eduDetails;
	}
	public List<Certification> getCertDetails() {
		return certDetails;
	}
	public void setCertDetails(List<Certification> certDetails) {
		this.certDetails = certDetails;
	}
	public List<Posting> getAppliedPostings() {
		return appliedPostings;
	}
	public void setAppliedPostings(List<Posting> appliedPostings) {
		this.appliedPostings = appliedPostings;
	}
	
	
}
