package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {
    String[] name = new String[]{"T1 Esports","DragonX","Nongshim RedForce",
    "Afreeca Freecs","Fredit BRION","AF ESport","KT Rolster","Damwon Kia","Hanwha Life","Gen.G",
    "Liiv SANDBOX","GRIFFIN"};
    String[] view = new String[]{"526 231","126 756","265 841","210 348","128 384",
    "481 213","213 142","124 547","314 112","172 256","124 562","121 567"};
    int[] imgs = new int[]{R.drawable.t1,R.drawable.drx,R.drawable.rbo,
            R.drawable.afca,R.drawable.bro,R.drawable.af,
            R.drawable.rox,R.drawable.dwg,R.drawable.hle,
            R.drawable.geng,R.drawable.liv,R.drawable.grf};
    GridView lvTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        innitControl();
    }
    private void innitControl(){
        lvTeam = findViewById(R.id.lv_team);
        ArrayList<Team> list = new ArrayList<>();
        for(int i=0; i <name.length; i++){
            list.add(new Team(imgs[i],name[i],view[i]));
        }
        ListViewBai2 adapter = new ListViewBai2(list);
        lvTeam.setAdapter(adapter);
    }

}