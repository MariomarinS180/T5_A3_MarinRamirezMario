package com.example.bd_android_dic_2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class ActivityMenu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public  void irConsultas(View v){
        Intent i;
        i = new Intent(this, ActivityConsultas.class);
        startActivity(i);
    }

}
