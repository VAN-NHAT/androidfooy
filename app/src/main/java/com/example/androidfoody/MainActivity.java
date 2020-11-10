package com.example.androidfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button tatca, diadiem, anh, baiviet;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diadiem = (Button) findViewById(R.id.tab_photos);
        anh = (Button) findViewById(R.id.tab_video);
        baiviet = (Button) findViewById(R.id.tab_music);


        diadiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_diadiem();
            }
        });
        anh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_anh();
            }
        });
        baiviet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_baiviet();
            }
        });
    }
    void xml_activitymain(){
        Intent intent = new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }
    void xml_diadiem(){
        Intent intent = new Intent(this, com.example.androidfoody.diadiem.class);
        this.startActivity(intent);
    }
    void xml_anh(){
        Intent intent = new Intent(this, com.example.androidfoody.anh.class);
        this.startActivity(intent);
    }
    void xml_baiviet(){
        Intent intent = new Intent(this, com.example.androidfoody.baiviet.class);
        this.startActivity(intent);
    }
}