package deso1.nguyenanhnhathuy.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtDiem;
    CheckBox CK1, CK2, CK3;
    SeekBar SB1,SB2, SB3;
    ImageButton btnPlay;
    int soDiem = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
    private void innitControl(){
        txtDiem =findViewById(R.id.txt_diem);
        CK1 = findViewById(R.id.txt_checkbox1);
        CK2 = findViewById(R.id.txt_checkbox2);
        CK3 = findViewById(R.id.txt_checkbox3);
        SB1 = findViewById(R.id.Seekbar1);
        SB2 = findViewById(R.id.Seekbar2);
        SB3 = findViewById(R.id.Seekbar3);
        btnPlay = findViewById(R.id.btn_Play);

        txtDiem.setText(soDiem + "");

        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                int number = 5;
                Random rd = new Random();
                int one = rd.nextInt(number);
                int two = rd.nextInt(number);
                int three = rd.nextInt(number);
                if(SB1.getProgress() >= SB1.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"CAR ONE WIN",Toast.LENGTH_SHORT).show();

                    if(CK1.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this,"YOU WIN",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this,"YOU LOSE",Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                }
                if(SB2.getProgress() >= SB2.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"CAR TWO WIN",Toast.LENGTH_SHORT).show();
                    if(CK2.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this,"YOU WIN",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this,"YOU LOSE",Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");

                }
                if(SB3.getProgress() >= SB3.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this,"CAR THREE WIN",Toast.LENGTH_SHORT).show();
                    if(CK3.isChecked()){
                        soDiem += 10;
                        Toast.makeText(MainActivity.this,"YOU WIN",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        soDiem -= 5;
                        Toast.makeText(MainActivity.this,"YOU LOSE",Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                }

                SB1.setProgress(SB1.getProgress()+ one);
                SB2.setProgress(SB2.getProgress()+ two);
                SB3.setProgress(SB3.getProgress()+ three);

            }

            @Override
            public void onFinish() {

            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CK1.isChecked() ||CK2.isChecked() ||CK3.isChecked()){
                    countDownTimer.start();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Vui lòng đặt cược trước khi chơi",Toast.LENGTH_SHORT).show();
                }


            }
        });
        CK1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    CK2.setChecked(false);
                    CK3.setChecked(false);
                }
            }
        });
        CK2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    CK1.setChecked(false);
                    CK3.setChecked(false);
                }
            }
        });
        CK3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    CK2.setChecked(false);
                    CK1.setChecked(false);
                }
            }
        });

    }
}