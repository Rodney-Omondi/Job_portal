package com.example.jobportal

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class JobDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_details)

        findViewById<TextView>(R.id.tvTitle).text =
            intent.getStringExtra("title")

        findViewById<TextView>(R.id.tvCompany).text =
            intent.getStringExtra("company")

        findViewById<TextView>(R.id.tvLocation).text =
            intent.getStringExtra("location")

        findViewById<TextView>(R.id.tvDescription).text =
            intent.getStringExtra("description")
    }
}
