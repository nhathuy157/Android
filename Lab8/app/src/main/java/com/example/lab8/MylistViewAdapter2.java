package com.example.lab8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MylistViewAdapter2 extends BaseAdapter {
    ArrayList<Nation> list2;
    public MylistViewAdapter2(ArrayList<Nation> list2){
        this.list2 = list2;
    }

    @Override
    public int getCount() {
        return list2.size();
    }

    @Override
    public Object getItem(int i) {
        return list2.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(viewGroup.getContext(),R.layout.custom_lv_2, null);
        Nation nation = (Nation)getItem(i);
        ImageView img = v.findViewById(R.id.imgRow);
        img.setImageResource(nation.image);
        TextView txtName = v.findViewById(R.id.txtName);
        txtName.setText(nation.name);
        TextView txtPopulation = v.findViewById(R.id.txtPopulation);
        txtPopulation.setText(nation.population);
        return v;
    }
}
