package com.example.lab8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewBai2 extends BaseAdapter {
    ArrayList<Team> list;
    public  ListViewBai2 (ArrayList<Team> list){
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
        View v = View.inflate(viewGroup.getContext(),R.layout.custom_lv_team,null);
        Team team =(Team) getItem(i);
        ImageView img = v.findViewById(R.id.imgRow);
        img.setImageResource(team.image);
        TextView txt_name = v.findViewById(R.id.txt_name);
        txt_name.setText(team.name);
        TextView txt_view = v.findViewById(R.id.txt_view);
        txt_view.setText(team.view+" Viewer");
        return v;
    }
}
