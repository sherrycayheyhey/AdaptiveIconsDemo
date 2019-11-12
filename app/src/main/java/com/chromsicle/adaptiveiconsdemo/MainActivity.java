package com.chromsicle.adaptiveiconsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



//to learn how to make adaptive icons, check out:
// https://developer.android.com/guide/practices/ui_guidelines/icon_design_adaptive

//here all I did was change the manifest round icon and
//the ic_launcher.xml background



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
