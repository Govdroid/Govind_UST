package com.ust.JobNotification.service;

import com.ust.JobNotification.model.JobNotificationModel;
import com.ust.JobNotification.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNotificationService {
    @Autowired
    private JobRepository repo;

    public JobNotificationModel addnewjob(JobNotificationModel newjob){
        return repo.save(newjob);
    }
    public List<JobNotificationModel>getAllJobs(){
        return repo.findAll();
    }

    public JobNotificationModel getjobbyid(int jobId) {
        return repo.findById(jobId).orElse(null);
    }
}

