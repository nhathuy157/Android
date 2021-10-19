package deso1.nguyenanhnhathuy.columns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MyCanvas myCanvas;
    Button btnDraw;
    EditText etNhap;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                    Toast.makeText(MainActivity.this, "Chưa nhập số cột",Toast.LENGTH_SHORT).show();
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