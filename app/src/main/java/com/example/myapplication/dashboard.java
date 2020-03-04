package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        final ListView List =findViewById(R.id.zizo);
        ArrayList<String> arrayList = new ArrayList<>() ;
        arrayList.add("Windows") ;
        arrayList.add("BlackBerry") ;
        arrayList.add("Iphone") ;
        arrayList.add("Linux") ;
        arrayList.add("Android") ;


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        List.setAdapter(arrayAdapter);
        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = (String) List.getItemAtPosition(position) ;
                Intent i = new Intent(dashboard.this,MainPage.class) ;
                startActivity(i) ;
            }
        });


    }
}
