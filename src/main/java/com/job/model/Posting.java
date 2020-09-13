package com.job.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
public class Posting {
@Id
@Generated(value = "com.acme.generator.CodeGen")
String id;
@TextIndexed
String roleTitle;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getRoleTitle() {
	return roleTitle;
}
public void setRoleTitle(String roleTitle) {
	this.roleTitle = roleTitle;
}
public float getReqMinExperience() {
	return reqMinExperience;
}
public void setReqMinExperience(float reqMinExperience) {
	this.reqMinExperience = reqMinExperience;
}
public List<String> getReqSkills() {
	return reqSkills;
}
public void setReqSkills(List<String> reqSkills) {
	this.reqSkills = reqSkills;
}
public Date getPostedDate() {
	return postedDate;
}
public void setPostedDate(Date postedDate) {
	this.postedDate = postedDate;
}
public Date getLastDateToApply() {
	return lastDateToApply;
}
public void setLastDateToApply(Date lastDateToApply) {
	this.lastDateToApply = lastDateToApply;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public String getRoleDesc() {
	return roleDesc;
}
public void setRoleDesc(String roleDesc) {
	this.roleDesc = roleDesc;
}
public List<Seeker> getAppliedCandidates() {
	return appliedCandidates;
}
public void setAppliedCandidates(List<Seeker> appliedCandidates) {
	this.appliedCandidates = appliedCandidates;
}
float reqMinExperience;

@DBRef(lazy=true)
List<String> reqSkills=new ArrayList<String>();

Date postedDate=new Date();
Date lastDateToApply=new Date();
@TextIndexed
String CompanyName;

String roleDesc;
@DBRef(lazy=true)
List<Seeker> appliedCandidates=new ArrayList<Seeker>();

}
