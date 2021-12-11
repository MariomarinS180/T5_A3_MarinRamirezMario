package com.example.bd_android_dic_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void VerAltas(View v){
        Intent i;
        i = new Intent(this, ActivityAltas.class);
        startActivity(i);
    }
    public  void irMenu(View v){
        Intent i;
        i = new Intent(this, ActivityMenu.class);
        startActivity(i);
    }
}