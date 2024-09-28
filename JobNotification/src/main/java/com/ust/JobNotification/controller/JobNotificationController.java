package com.ust.JobNotification.controller;

import com.ust.JobNotification.model.JobNotificationModel;
import com.ust.JobNotification.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {

    @Autowired
    private JobNotificationService service;

    @PostMapping("/addnewjob")
    public JobNotificationModel addnewjob(@RequestBody JobNotificationModel newjob){
        return service.addnewjob(newjob);
    }

    @GetMapping("/jobs")
    public List<JobNotificationModel> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobs/{JobId}")
    public JobNotificationModel getjobbyid(@PathVariable int JobId){
        return service.getjobbyid(JobId);
    }

    @DeleteMapping("/jobs/{JobId}")
    public String deleteJob(@PathVariable int JobId) {
        service.deleteJob(JobId);
        return "Job with ID " + JobId + " has been deleted";
    }

    @PutMapping("/jobs/{JobId}")
    public JobNotificationModel updateJob(@PathVariable int JobId, @RequestBody JobNotificationModel updatedJob) {
        return service.updateJob(JobId, updatedJob);
    }

}
