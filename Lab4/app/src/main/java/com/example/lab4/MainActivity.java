package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Bai1;
    Button Bai2;
    Button Bai3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bai1();
        Bai2();
        Bai3();
    }
    private void Bai1(){
        Bai1 = findViewById(R.id.btn_BT1);
        Bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Bai1.class);
                startActivity(intent1);

            }
        });
    }
    private void Bai2(){
        Bai2 = findViewById(R.id.btn_BT2);
        Bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Bai2.class);
                startActivity(intent2);

            }
        });
    }
    private void Bai3(){
        Bai3 = findViewById(R.id.btn_BT3);
        Bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Bai3.class);
                startActivity(intent3);

            }
        });
    }
}