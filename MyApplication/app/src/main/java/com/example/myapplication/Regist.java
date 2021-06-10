package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Regist extends AppCompatActivity {
private String url = "http://cinema.areas.su/auth/register";
private Button br_ZRegist;
private Button bt_BRegist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        br_ZRegist = findViewById(R.id.button2);
        br_ZRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.myapplication.Regist.this,com.example.myapplication.MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        bt_BRegist = findViewById(R.id.button3);
        bt_BRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.myapplication.Regist.this,com.example.myapplication.MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}