package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class Bai1 extends AppCompatActivity {
    LinearLayout line1;
    ImageView imgView;
    Button btn_lui;
    Button btn_toi;


    ArrayList<Integer> arrayImage;
    ArrayList <Integer> arrayColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        innitControl();
    }
    public void innitControl(){
        line1 = findViewById(R.id.line1);
        imgView = findViewById(R.id.imgView);
        Add();
        Random();
        btn_lui = findViewById(R.id.btn_lui);
        btn_lui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai1.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn_toi = findViewById(R.id.btn_toi);
        btn_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Bai1.this, Bai2.class);
                startActivity(intent1);

            }
        });

    }
    public  void Add(){
        arrayImage = new ArrayList<>();
        arrayColor = new ArrayList<>();

        arrayImage.add(R.drawable.cat);
        arrayImage.add(R.drawable.frog);
        arrayImage.add(R.drawable.hp_dog);
        arrayImage.add(R.drawable.penguin);
        arrayImage.add(R.drawable.remember_the_milk);

        arrayColor.add(R.color.white);
        arrayColor.add(R.color.black);
        arrayColor.add(R.color.design_default_color_surface);
        arrayColor.add(R.color.teal_700);
        arrayColor.add(R.color.teal_200);

    }
    public void Random(){
        Random rd = new Random();
        int Anh = rd.nextInt(arrayImage.size());
        int Mau = rd.nextInt(arrayColor.size());
        imgView.setBackgroundResource(arrayImage.get(Anh));
        line1.setBackgroundResource(arrayColor.get(Mau));

    }
}