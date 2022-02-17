package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    TextView birthdayGreeting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        birthdayGreeting = findViewById(R.id.birthdayGreeting);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        birthdayGreeting.setText("Happy Birthday\n"+name+"!");

    }
}