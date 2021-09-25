package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_LT1;
    Button btn_LT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lt1();
        Lt2();
    }
    private void Lt1(){
        btn_LT1 = findViewById(R.id.btn_LT1);
        btn_LT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, bai1.class);
                startActivity(intent1);
            }
        });
    }
    private void Lt2(){
        btn_LT2 = findViewById(R.id.btn_LT2);
        btn_LT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, bai2.class);
                startActivity(intent2);
            }
        });
    }
}