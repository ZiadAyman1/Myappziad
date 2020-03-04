package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
      private Button login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login =(Button) findViewById(R.id.button2) ;
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openapp() ;
            }
        });}
        public void openapp(){
            Intent i = new Intent(this,dashboard.class) ;
            startActivity(i);
        }
    }



