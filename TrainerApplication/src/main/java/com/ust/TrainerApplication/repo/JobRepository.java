package com.ust.TrainerApplication.repo;


import com.ust.TrainerApplication.model.JobNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobNotification, Long> {
}
