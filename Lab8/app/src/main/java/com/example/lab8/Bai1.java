package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Bai1 extends AppCompatActivity {
    String[] name = new String[]{"Hamburger","Bánh mì","Phở","Pizza",
            "Khoai tây chiên","Sandwich","Gà rán","Hot dog"};
    String[] description = new String[]{"Bánh mì kẹp thịt tròn",
    "Bánh mì kẹp thịt", "Phở bò, phở gà","Bánh nướng","Khoai tây chiên không dầu",
     "Bánh mì kẹp thịt, trứng và salat","Thịt gà tẩm ướp và rán","Bánh mì kẹp xúc xích"};
    int[] imgs = new int[]{R.drawable.hamburger, R.drawable.banhmi1,
    R.drawable.pho,R.drawable.pizza,R.drawable.khoaitaychien,R.drawable.sandwich,R.drawable.poultry_leg,R.drawable.hot_dog};
    String[] price = new String[]{"12","10","30","50","15","15","40","15"};

    ListView lvFood ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        innitControl();


    }
  /* @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.iv_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.iv_menu, menu);
        return true;
    }

    private void innitControl() {
        lvFood = findViewById(R.id.lv_Food);
        ArrayList<Food> list = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {

            list.add(new Food(imgs[i], name[i], description[i], price[i]));
        }
        ListViewBai1 adapter = new ListViewBai1(list);
        lvFood.setAdapter(adapter);
    }
}