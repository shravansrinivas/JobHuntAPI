package com.job.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Repository;

import com.job.model.Posting;
@Repository
public class PostingImpl implements PostingDAL{
	@Autowired
	private MongoTemplate mongo;
	@Override
	public Posting getPostById(String id) {
		Query q=new Query();

		q.addCriteria(Criteria.where("id").is(id));
		return mongo.find(q, Posting.class).get(0);
	}

	@Override
	public Posting addPost(Posting p) {
		
		return mongo.save(p);
	}

	@Override
	public List<Posting> searchPostByKeyword(String keyword) {
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(
	            keyword);
		Query query = TextQuery.queryText(criteria).sortByScore();
		//query.addCriteria(Criteria.where("anIntegerProperty").is(1)); 
		// TODO Auto-generated method stub
		return mongo.find(query,Posting.class);
	}

	@Override
	public List<Posting> getAllPostings() {
		// TODO Auto-generated method stub
		return mongo.findAll(Posting.class);
	}

//	@Override
//	public List<Posting> searchPostByExp(float year) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Posting> searchPostByTitle(String Title) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
