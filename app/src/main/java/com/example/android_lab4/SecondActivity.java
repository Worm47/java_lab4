package com.example.android_lab4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvBirthday = findViewById(R.id.tv_birthday);

        String name = getIntent().getStringExtra("name");
        String date = getIntent().getStringExtra("date");

        String message = "День рождения " + name + " (" + date + ")";
        tvBirthday.setText(message);
    }
}

