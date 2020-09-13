package com.job.repo;

import com.job.model.Recruiter;

public interface RecruiterDAL {
Recruiter findById(String Id);
Recruiter addNew(Recruiter rec);
}
