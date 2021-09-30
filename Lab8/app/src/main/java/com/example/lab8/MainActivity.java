package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button LT1, LT2,BT1,BT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
    private void innitControl(){
        LT1 = findViewById(R.id.btn_LT1);
        LT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuyenTap1.class);
                startActivity(intent);

            }
        });
        LT2 = findViewById(R.id.btn_LT2);
        LT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LuyenTap2.class);
                startActivity(intent);

            }
        });
        BT1 = findViewById(R.id.btn_BT1);
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai1.class);
                startActivity(intent);

            }
        });
        BT2 = findViewById(R.id.btn_BT2);
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai2.class);
                startActivity(intent);

            }
        });

    }
}