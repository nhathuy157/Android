package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LuyenTap2 extends AppCompatActivity {
    String[] name = new String[]{"Vietnam","United","Russia","Australia","Japan"};
    String[] population = new String[]{"98000000","320000000","142000000","23766305","126788677"};
    int[] images = new int[]{R.drawable.vietnam, R.drawable.usa_48px,R.drawable.russian,
            R.drawable.australia,R.drawable.japan};

    GridView lvNation;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luyen_tap2);
        innitControl();
    }
    private  void  innitControl(){
        lvNation = findViewById(R.id.lv_nation);
        txtDisplay = findViewById(R.id.txtDisplay2);
        ArrayList<Nation> list2 = new ArrayList<>();
        for(int i=0; i < name.length; i++){
            list2.add(new Nation(images[i],name[i],population[i]));
        }
        MylistViewAdapter2 adapter = new MylistViewAdapter2(list2);
        lvNation.setAdapter(adapter);
        lvNation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtDisplay.setText("Selected : "+name[i]+"(Population : "+ population[i]+")");
            }
        });

    }
}