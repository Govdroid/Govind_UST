package com.ust.TrainerApplication.service;

import com.ust.TrainerApplication.model.JobNotification;
import com.ust.TrainerApplication.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobNotificationService {

    @Autowired
    private JobRepository jobRepository;

    public JobNotification addJob(JobNotification job) {
        return jobRepository.save(job);
    }

    public List<JobNotification> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<JobNotification> getJobById(Long jobId) {
        return jobRepository.findById(jobId);
    }
}
