package com.example.a16022596.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    TextView tvSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        tvSummary = (TextView)findViewById(R.id.textViewResult);


        Intent intRecieved = getIntent();
        String[] summary = intRecieved.getStringArrayExtra("result");

        tvSummary.setText("Read on materials before class: " + summary[0] + "\n" +
        "Arrive on time so as not to miss important part of the lesson: " + summary[1] + "\n" +
        "Attempt the problem myself: " + summary[2] + "\n" +
        "Reflection: " + summary[3]);

    }
}
