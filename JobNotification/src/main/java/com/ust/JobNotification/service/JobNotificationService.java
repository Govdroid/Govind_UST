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

    public void deleteJob(int jobId) {
        repo.deleteById(jobId);
    }

    public JobNotificationModel updateJob(int jobId, JobNotificationModel updatedJob) {
        return repo.findById(jobId).map(existingJob -> {
            // Update fields in the existing job
            existingJob.setJobTitle(updatedJob.getJobTitle());
            existingJob.setDescription(updatedJob.getDescription());
            existingJob.setLocation(updatedJob.getLocation());
            existingJob.setSalary(updatedJob.getSalary());
            // Add any additional fields that need to be updated
            return repo.save(existingJob); // Save the updated job back to the database
        }).orElse(null); // If job not found, return null or handle as per your logic
    }

}

