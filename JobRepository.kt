package com.example.jobportal.repository

import com.example.jobportal.Job

class JobRepository {

    private val jobs = mutableListOf<Job>()

    fun addJob(job: Job) {
        jobs.add(job)
    }

    fun getJobs(): List<Job> = jobs
}



