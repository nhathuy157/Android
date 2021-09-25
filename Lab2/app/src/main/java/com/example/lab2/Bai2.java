package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai2 extends AppCompatActivity {
    Button btn_toi;
    Button btn_lui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        innitControl();
    }
    private void  innitControl()
    {
        btn_lui = findViewById(R.id.btn_lui);
        btn_lui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai2.this, Bai1.class);
                startActivity(intent);
            }
        });
        btn_toi = findViewById(R.id.btn_toi);
        btn_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Bai2.this, Bai3.class);
                startActivity(intent1);

            }
        });
    }
}