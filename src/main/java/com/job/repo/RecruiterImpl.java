package com.job.repo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.job.model.Recruiter;

@Repository
public class RecruiterImpl implements RecruiterDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Recruiter findById(String Id) {
		Query q=new Query();
		q.addCriteria(Criteria.where("id").is(Id));
		return mongo.find(q, Recruiter.class).get(0);
	}

	@Override
	public Recruiter addNew(Recruiter rec) {
		return mongo.save(rec);
	}

}
