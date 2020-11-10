package com.example.androidfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class anh extends Activity {

    Button tatca, diadiem, anh, baiviet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anh);

        tatca = (Button) findViewById(R.id.tab_main);
        diadiem = (Button) findViewById(R.id.tab_photos);
        baiviet = (Button) findViewById(R.id.tab_music);


        tatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_activitymain();
            }
        });
        diadiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_photos();
            }
        });
        baiviet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xml_music();
            }
        });

    }


    void xml_activitymain(){
        Intent intent = new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }

    void xml_photos(){
        Intent intent = new Intent(this, com.example.androidfoody.diadiem.class);
        this.startActivity(intent);
    }
    void xml_music(){
        Intent intent = new Intent(this, com.example.androidfoody.baiviet.class);
        this.startActivity(intent);
    }


}
