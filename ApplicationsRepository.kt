package com.example.jobportal

object ApplicationRepository {

    private val applications = mutableListOf<JobApplication>()

    fun apply(application: JobApplication) {
        applications.add(application)
    }

    fun getAllApplications(): List<JobApplication> {
        return applications
    }
}
