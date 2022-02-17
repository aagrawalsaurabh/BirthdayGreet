package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText nameInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.createBirthdayButton);
        nameInput = findViewById(R.id.nameInput);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity2.class);
            String name = nameInput.getText().toString();
            intent.putExtra("name",name);
            startActivity(intent);

        });
    }
}