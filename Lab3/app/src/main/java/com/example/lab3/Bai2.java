package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class Bai2 extends AppCompatActivity {
    TextView tv_TA, tv_TV, tv_TP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        innitControl();
    }
    private void innitControl(){
        tv_TA = findViewById(R.id.tv_TA);
        tv_TV = findViewById(R.id.tv_TV);
        tv_TP = findViewById(R.id.tv_TP);

        tv_TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("vi","VN");
            }
        });
        tv_TA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("en","US");
            }
        });
        tv_TP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("fr","FR");
            }
        });
    }
    private void changeLanguage(String language, String lan){
        Locale locale = new Locale(language,lan);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(
                config,getBaseContext().getResources().getDisplayMetrics()
        );
        Intent intent =new Intent(Bai2.this, Bai2.class);
        startActivity(intent);
    }
}