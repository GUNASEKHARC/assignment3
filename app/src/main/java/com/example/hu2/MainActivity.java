package com.example.hu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText btn= findViewById(R.id.editTextTextPersonName2);
                EditText btn1= findViewById(R.id.editTextNumber3);
                EditText btn2= findViewById(R.id.editTextTextPersonName5);
                EditText btn3= findViewById(R.id.editTextPhone);
                EditText btn4= findViewById(R.id.editTextTextPersonName6);
                String name =btn.getText().toString();
                int age  =Integer.parseInt(btn1.getText().toString());
                String bio =btn2.getText().toString();
                int mn =Integer.parseInt(btn3.getText().toString());;
                String location  =btn4.getText().toString();

                Intent intent= new Intent (MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",name);
                intent.putExtra("Age",age);
                intent.putExtra("Bio",bio);
                intent.putExtra("Mn",mn);
                intent.putExtra("Location",location);
                startActivity(intent);
            }
        });
    }

}
