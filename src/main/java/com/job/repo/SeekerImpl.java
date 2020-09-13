package com.job.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.job.model.Posting;
import com.job.model.Seeker;

public class SeekerImpl implements SeekerDAL{
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Seeker findById(String Id) {
		Query q=new Query();
		q.addCriteria(Criteria.where("id").is(Id));
		return mongo.find(q, Seeker.class).get(0);
	}

	@Override
	public Seeker addNew(Seeker sek) {
		
		return mongo.save(sek);
	}
//
//	@Override
//	public Seeker updateById(String id, Seeker seek) {
//		Query query=new Query();
//		query.addCriteria(Criteria.where("id").is(id));
//		return mongo.updateFirst(query,seek , Seeker.class);
//	}
//	@Override
//	public Seeker applyUpdateById(String seekerId,String postId) {
//		// TODO Auto-generated method stub
//		Seeker actSeeker= findById(seekerId);
//		Posting jobPost=findById(postId);
//		
//		return updateById(seekerId, actSeeker);
//	}

}
