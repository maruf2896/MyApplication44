package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(getIntent() != null) {
            int imageId = getIntent().getIntExtra("imageId", -1);
            if(imageId > -1) {
                //you can show the image using this image id
            }
        }
    }
}