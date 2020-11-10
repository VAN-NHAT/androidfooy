package com.example.androidfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class baiviet extends Activity {

    Button tatca, diadiem, anh, baiviet;
    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baiviet);
        tatca = (Button) findViewById(R.id.tab_main);
        diadiem = (Button) findViewById(R.id.tab_video);
        anh = (Button) findViewById(R.id.tab_photos);






        tatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_activity();
            }
        });
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


    }
    void xml_activity(){
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


}
