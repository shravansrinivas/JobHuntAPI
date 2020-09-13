package com.job.repo;

import com.job.model.Recruiter;
import com.job.model.Seeker;

public interface SeekerDAL {
	Seeker findById(String Id);
	Seeker addNew(Seeker sek);
	//Seeker updateById(String Id);
	//Seeker applyUpdateById(String seekerId, String postId);
	
	
}
