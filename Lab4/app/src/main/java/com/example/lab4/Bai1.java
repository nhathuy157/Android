package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Bai1 extends AppCompatActivity {
    EditText name;
    EditText pass;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        innitControl();
    }
    private  void innitControl(){
        name = findViewById(R.id.txt_email);
        pass = findViewById(R.id.txt_pass);
        login = findViewById(R.id.tv_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast toast = new Toast(Bai1.this);
                LayoutInflater inflater =getLayoutInflater();
                View v = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.ll_toast));
                TextView tv_mess = v.findViewById(R.id.tv_text);
                tv_mess.setText(new StringBuilder().append("Bạn đã đăng nhập thành công với Email: ").
                        append(name.getText()).append("\nMật khẩu: ").append(pass.getText()).toString());
                toast.setView(v);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

            }
        });
    }

}