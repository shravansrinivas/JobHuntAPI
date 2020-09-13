package com.job.repo;

import java.util.List;

import com.job.model.Posting;

public interface PostingDAL {
	Posting getPostById(String id);
	Posting addPost(Posting p);
//	List<Posting> searchPostByCompany(String company);
//	List<Posting> searchPostByExp(float year);
//	List<Posting> searchPostByTitle(String Title);
//	
	List<Posting> searchPostByKeyword(String keyword);
	List<Posting> getAllPostings();
	
}
