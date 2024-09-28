package com.ust.JobNotification.repo;

import com.ust.JobNotification.model.JobNotificationModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface JobRepository extends JpaRepository<JobNotificationModel, Integer> {
}
