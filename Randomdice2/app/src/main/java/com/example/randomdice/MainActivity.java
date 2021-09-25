package com.example.randomdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
    private void innitControl(){
        Random rd = new Random();
        imgPhoto = findViewById(R.id.imgPhoto);
        imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = 1 +rd.nextInt(6);
                if (x == 1)
                    imgPhoto.setImageResource(R.drawable.one);
                else if (x == 2)
                    imgPhoto.setImageResource(R.drawable.two);
                else if (x == 3)
                    imgPhoto.setImageResource(R.drawable.three);
                else if (x == 4)
                    imgPhoto.setImageResource(R.drawable.four);
                else if (x == 5)
                    imgPhoto.setImageResource(R.drawable.five);
                else
                    imgPhoto.setImageResource(R.drawable.six);
            }
        });

    }
}