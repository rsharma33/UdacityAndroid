package com.rajesh.nanodegree.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {
    Button spotifyBtn;
    Button scoreappBtn;
    Button libraryBtn;
    Button buildbiggerBtn;
    Button xyzBtn;
    Button ownappBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        spotifyBtn=(Button) findViewById(R.id.spotify_btn);
        scoreappBtn=(Button) findViewById(R.id.scoreapp_btn);
        libraryBtn=(Button) findViewById(R.id.library_btn);
        buildbiggerBtn=(Button) findViewById(R.id.buildbigger_btn);
        xyzBtn=(Button) findViewById(R.id.xyz_btn);
        ownappBtn=(Button) findViewById(R.id.ownapp_btn);

        spotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Media Streamer Application!", 1000).show();
            }
        });
        scoreappBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Score Application!", 1000).show();
            }
        });
        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Library Application!", 1000).show();
            }
        });
        buildbiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Build It Bigger Application!", 1000).show();
            }
        });
        xyzBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my XYZ Reader Application!", 1000).show();
            }
        });
        ownappBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This Button will launch my Capstone Application!", 1000).show();
            }
        });
    }
}
