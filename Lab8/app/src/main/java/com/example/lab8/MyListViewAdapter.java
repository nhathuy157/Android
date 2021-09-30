package com.example.lab8;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter {
    ArrayList<Product> list;
    public MyListViewAdapter(ArrayList<Product> list){
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
        View v = View.inflate(viewGroup.getContext(),R.layout.custom_lv,null );
        Product product = (Product) getItem(i);
        ImageView img = v.findViewById(R.id.imgRow);
        img.setImageResource(product.image);
        TextView txtTitle = v.findViewById(R.id.txtTitle);
        txtTitle.setText(product.title);
        TextView txtContent = v.findViewById(R.id.txtContent);
        txtContent.setText(product.content);
        return v;
    }
}
