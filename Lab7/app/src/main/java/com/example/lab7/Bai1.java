package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Bai1 extends AppCompatActivity {
    Button btnToast;
    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        showToast();
        showDialog();
    }
    private void showToast(){
        btnToast = findViewById(R.id.btn_toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(Bai1.this);
                LayoutInflater inflater = getLayoutInflater();
                View v = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.ll_toast));
                toast.setView(v);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
    private void showDialog(){
        btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Bai1.this);
                dialog.setContentView(R.layout.custom_dialog);
                Button btn = (Button) dialog.findViewById(R.id.btn_login);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();;
                    }
                });
                dialog.show();
            }
        });

    }
}