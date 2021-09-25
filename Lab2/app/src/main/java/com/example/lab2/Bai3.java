package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Bai3 extends AppCompatActivity {
    ImageButton btn_call;
    TextView phoneNb;
    Button btn_lui;
    Button btn_toi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        innitControl();
        checkAndRequestPermission();
    }
    private void innitControl(){
        btn_call = findViewById(R.id.btn_call);
        phoneNb = findViewById(R.id.phoneNb);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + phoneNb.getText()));
                startActivity(intent);
            }
        });
        btn_lui = findViewById(R.id.btn_lui);
        btn_lui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Bai3.this, Bai2.class);
                startActivity(intent);
            }
        });
        btn_toi = findViewById(R.id.btn_toi);
        btn_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Bai3.this, MainActivity.class);
                startActivity(intent1);

            }
        });
    }
    private void checkAndRequestPermission(){
        String[] permissions = new String[]{
                Manifest.permission.CALL_PHONE
        };

        List<String> listPermissionNeed = new ArrayList<>();
        for(String permission : permissions){
            if(ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED){
                listPermissionNeed.add(permission);
            }
        }
        if(!listPermissionNeed.isEmpty()){
            ActivityCompat.requestPermissions(this, listPermissionNeed.toArray(new String[listPermissionNeed.size()]),1);
        }
    }
}