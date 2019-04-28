package com.yhjzs.GraduationProject2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }
    public void onClick(View v){
        Intent jump=new Intent(getApplicationContext(),WebviewActivity.class);
        startActivity(jump);
    }
}
