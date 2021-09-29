package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {
    SeekBar seekBar_R,seekBar_G,seekBar_B;
    TextView tv_R,tv_G,tv_B;
    int  Value_R = 0;
    int  Value_G = 0;
    int  Value_B = 0;
    Button btnRGB;
    Button btnCMY;
    int r = Value_R;
    int g = Value_G;
    int b = Value_B;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        SeekBarR();
        SeekBarG();
        SeekBarB();
        innitView(r,g,b);

    }
    private void SeekBarR(){
        seekBar_R =findViewById(R.id.SeekbarR);
        tv_R = findViewById(R.id.txt_R);

        seekBar_R.setMax(255);
        tv_R.setText("R = "+ Value_R);
        seekBar_R.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Value_R = i;
                tv_R.setText("R = "+ Value_R);
               innitView(Value_R,Value_G,Value_B);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });
    }
    private void SeekBarG(){
        seekBar_G = findViewById(R.id.SeekbarG);
        tv_G = findViewById(R.id.txt_G);

        seekBar_G.setMax(255);
        tv_G.setText("G = "+ Value_G);
        seekBar_G.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Value_G = i;
                tv_G.setText("G ="+ Value_G);
                innitView(Value_R,Value_G,Value_B);

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });
    }
    private void SeekBarB(){
        seekBar_B = findViewById(R.id.SeekbarB);
        tv_B = findViewById(R.id.txt_B);

        seekBar_B.setMax(255);
        tv_B.setText("B = "+ Value_B);
        seekBar_B.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Value_B = i;
                tv_B.setText("B ="+ Value_B);
                innitView(Value_R,Value_G,Value_B);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });
    }
    private void innitView(int r, int g , int b){
        btnRGB = findViewById(R.id.btn_rbg);
        btnRGB.setBackgroundColor(Color.rgb(r,g,b));
        btnCMY = findViewById(R.id.btn_cmy);
        btnCMY.setBackgroundColor(Color.rgb(255-r,255-g,255-b));
    }
}