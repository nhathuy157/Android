package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_LT1;
    Button btn_LT2;
    Button btn_bai2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lt1();
        Lt2();
        Bai2();
    }
    private void Lt1(){
        btn_LT1 = findViewById(R.id.btn_LT1);
        btn_LT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LT1.class);
                startActivity(intent1);
            }
        });
    }
    private void Lt2(){
        btn_LT2 = findViewById(R.id.btn_LT2);
        btn_LT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, LT2.class);
                startActivity(intent2);
            }
        });
    }
    private void Bai2(){
        btn_bai2 = findViewById(R.id.btn_Bai2);
        btn_bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Bai2.class);
                startActivity(intent2);
            }
        });
    }

}