package com.example.jobportal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewJobs)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val jobs = listOf(
            Job("Android Developer", "Google", "Nairobi", "Build Android apps"),
            Job("Backend Developer", "Safaricom", "Nairobi", "Develop APIs"),
            Job("UI/UX Designer", "Andela", "Remote", "Design user interfaces")
        )

        recyclerView.adapter = JobAdapter(jobs) { job ->
            val intent = Intent(this, JobDetailsActivity::class.java)
            intent.putExtra("title", job.title)
            intent.putExtra("company", job.company)
            intent.putExtra("location", job.location)
            intent.putExtra("description", job.description)
            startActivity(intent)
        }
    }
}


