package com.example.lab8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewBai1 extends BaseAdapter {
    ArrayList<Food> list;
    public ListViewBai1 (ArrayList<Food> list){
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(viewGroup.getContext(),R.layout.custom_lv_food,null);
        Food food = (Food) getItem(i);
        ImageView img = v.findViewById(R.id.imgRow);
        img.setImageResource(food.image);
        TextView txtName = v.findViewById(R.id.txt_Name);
        txtName.setText(food.name);
        TextView txtDescription = v.findViewById(R.id.txt_Description);
        txtDescription.setText(food.description);
        TextView txtPrice = v.findViewById(R.id.txt_Price);
        txtPrice.setText("Giá : "+ food.price+".000 đ");
        return v;
    }
}
