package com.example.animeshpatra.serviceexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button mStartService;
    Button mStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Declare the start service button
        mStartService = (Button) findViewById(R.id.btn_start_service);

        // Declare the stop service button
        mStopService = (Button) findViewById(R.id.btn_stop_service);

        // Add event listener to each button
        mStartService.setOnClickListener(this);
        mStopService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // User click start button
        if (v == mStartService) {
            // Display the Toast Message
            startService(new Intent(getBaseContext(), DemoService.class));
        } else { // User click stop button
            // Stop the service
            stopService(new Intent(getBaseContext(), DemoService.class));
        }
    }
}