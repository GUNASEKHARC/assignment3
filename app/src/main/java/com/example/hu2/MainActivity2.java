package com.example.hu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        int age = intent.getIntExtra("Age",0);
        String bio = intent.getStringExtra("Bio");
        int mn = intent.getIntExtra("Mn",0);
        String location = intent.getStringExtra("Location");

        TextView textview1 = findViewById(R.id.name);
        TextView textview2 = findViewById(R.id.age);
        TextView textview3 = findViewById(R.id.bio);
        TextView textview4 = findViewById(R.id.mn);
        TextView textview5 = findViewById(R.id.loc);

        textview1.setText("Name: "+ name);
        textview2.setText("Age: "+ String.valueOf(age));
        textview3.setText("Bio: "+ bio);
        textview4.setText("Mobile Number: "+ String.valueOf(mn));
        textview5.setText("Location :"+location);
    }
}

