package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


//extends Fragment implements
public class Bai2 extends AppCompatActivity implements View.OnClickListener {
    private  static  final  int[] ID_DRAWABLES =
            {R.drawable.mess,R.drawable.plane,R.drawable.hospital,
            R.drawable.hotel,R.drawable.restaurant,R.drawable.cocktail,
            R.drawable.store,R.drawable.work,R.drawable.time,R.drawable.education,
            R.drawable.movie};
    private static final int[] ID_TEXTS =
            {R.string.txt_mess,R.string.txt_plane,R.string.txt_hospital,
            R.string.txt_hotel,R.string.txt_restaurant,R.string.txt_cocktail,
            R.string.txt_store,R.string.txt_work,R.string.txt_time,R.string.txt_education,
            R.string.txt_movie};
    ArrayList<String> arrWord = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        innitView();
    }
    private void innitView(){
        LinearLayout inMain= findViewById(R.id.ln_main);
        inMain.removeAllViews();
        //tạo ra các item topic động và add vào linear
        for(int i=0; i< ID_DRAWABLES.length;i++){
            View v= LayoutInflater.from(this).inflate(R.layout.item_topic,null);
            ImageView ivTopic = v.findViewById(R.id.iv_topic);
            TextView tvTopic = v.findViewById(R.id.tv_topic);
            ivTopic.setImageResource(ID_DRAWABLES[i]);
            tvTopic.setText(ID_TEXTS[i]);
            //Quy định không gian
            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            v.setLayoutParams(param);
            inMain.addView(v);
            tvTopic.setOnClickListener(this);

        }
    }

    @Override
    public void onClick(View view) {
        TextView tv = (TextView) view;

        if (tv.getText().toString().compareTo("Essentials")==0)
        {
            String[] word = getResources().getStringArray(R.array.Essentials);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Traveling")==0)
        {
            String[] word = getResources().getStringArray(R.array.Traveling);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Help")==0)
        {
            String[] word = getResources().getStringArray(R.array.Help);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();

        }
        else if (tv.getText().toString().compareTo("Hotel")==0)
        {
            String[] word = getResources().getStringArray(R.array.Hotel);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Education")==0)
        {
            String[] word = getResources().getStringArray(R.array.Education);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Restaurant")==0)
        {
            String[] word = getResources().getStringArray(R.array.Restaurant);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Bar")==0)
        {
            String[] word = getResources().getStringArray(R.array.Bar);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Store")==0)
        {
            String[] word = getResources().getStringArray(R.array.Store);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Work")==0)
        {
            String[] word = getResources().getStringArray(R.array.Work);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else if (tv.getText().toString().compareTo("Time")==0)
        {
            String[] word = getResources().getStringArray(R.array.Time);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();
        }
        else
        {
            String[] word = getResources().getStringArray(R.array.Entertainment);
            arrWord = new ArrayList<>(Arrays.asList(word));
            String string = "";
            for (String item:arrWord){
                string += item + "\n";
            }
            Toast.makeText(Bai2.this,string,Toast.LENGTH_LONG).show();

        }
    }

}