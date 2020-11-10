package com.example.androidfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diadiem extends Activity {


    Button tatca, diadiem, anh, baiviet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diadiem);
        tatca = (Button) findViewById(R.id.tab_main);
        anh = (Button) findViewById(R.id.tab_video);
        baiviet = (Button) findViewById(R.id.tab_music);


        tatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_activitymain();
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

    void xml_anh(){
        Intent intent = new Intent(this, com.example.androidfoody.anh.class);
        this.startActivity(intent);
    }
    void xml_baiviet(){
        Intent intent = new Intent(this, com.example.androidfoody.baiviet.class);
        this.startActivity(intent);
    }

}
