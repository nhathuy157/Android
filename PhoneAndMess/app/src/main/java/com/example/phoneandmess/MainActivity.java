package com.example.phoneandmess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtPhone;
    EditText txtSMS;
    Button btnCall;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();;
    }
    private void innitControl(){

        txtPhone = findViewById(R.id.txtPhone);
        txtSMS = findViewById(R.id.txtSMS);
        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PhoneNb = txtPhone.getText().toString();
                if (!TextUtils.isEmpty(PhoneNb)){
                    String Call = "tel:" + PhoneNb;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(Call)));

                }
                else {
                    Toast.makeText(MainActivity.this,"Enter a phone number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSend =findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = txtSMS.getText().toString();
                String PhoneNb = txtPhone.getText().toString();
                if (!TextUtils.isEmpty(PhoneNb)){
                    String Send = "smsto:" + PhoneNb;
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse(Send));
                    smsIntent.putExtra("sms_body",message);
                    startActivity(smsIntent);

                }

            }
        });
    }
}