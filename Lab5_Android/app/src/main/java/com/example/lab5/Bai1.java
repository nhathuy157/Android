package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class Bai1 extends AppCompatActivity  implements View.OnClickListener {
    private ImageView ivAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        innitViews();
    }
    private void innitViews(){
        ivAnimal = findViewById(R.id.iv_animal);
        findViewById(R.id.bt_alpha).setOnClickListener(this);
        findViewById(R.id.bt_rotate).setOnClickListener(this);
        findViewById(R.id.bt_scale).setOnClickListener(this);
        findViewById(R.id.bt_trans).setOnClickListener(this);
        findViewById(R.id.iv_animal).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bt_alpha){
            ivAnimal.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha));
        }
        else if(view.getId()==R.id.bt_rotate){
            ivAnimal.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate));
        }
        else if(view.getId()==R.id.bt_scale){
            ivAnimal.startAnimation(AnimationUtils.loadAnimation(this,R.anim.scale));
        }
        else if(view.getId()==R.id.bt_trans){
            ivAnimal.startAnimation(AnimationUtils.loadAnimation(this,R.anim.translate));
        }
        else if(view.getId()==R.id.iv_animal){
            final int[] anim ={R.anim.alpha,R.anim.rotate,R.anim.translate,R.anim.scale};
            Random random = new Random();
            view.startAnimation(AnimationUtils.loadAnimation(this,anim[random.nextInt(anim.length)]));;
        }

    }
}