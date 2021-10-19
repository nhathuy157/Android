package deso1.nguyenanhnhathuy.lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Bai1_Colums extends AppCompatActivity {
    MyCanvas myCanvas;
    Button btnDraw;
    EditText etNhap;
    int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_colums);
        innitControl();
    }
    private void innitControl(){
        myCanvas = findViewById(R.id.myCanvas);
        btnDraw = findViewById(R.id.btn_Draw);
        etNhap = findViewById(R.id.et_nhap);

        btnDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNhap.getText().toString().isEmpty())
                {
                    Toast.makeText(Bai1_Colums.this, "Chưa nhập số cột",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    number = Integer.parseInt(etNhap.getText().toString());
                    myCanvas.number = number;
                    myCanvas.invalidate();
                }
            }
        });
    }

}