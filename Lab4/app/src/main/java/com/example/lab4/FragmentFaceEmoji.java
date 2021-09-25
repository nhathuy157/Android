package com.example.lab4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class FragmentFaceEmoji extends Fragment implements View.OnClickListener {
    private static final int[] ids ={R.id.iv_face1,R.id.iv_face2,R.id.iv_face3,
            R.id.iv_face4,R.id.iv_face5,R.id.iv_face6,
            R.id.iv_face7,R.id.iv_face8,R.id.iv_face9,};
    private  Context mContext;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.face_emoij,container,false);
        innitViews(rootView);
        rootView.findViewById(R.id.btn_random).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int random = r.nextInt(9);
                ImageView ivFace =(ImageView) rootView.findViewById(ids[random]);
                showToast(ivFace.getDrawable());
            }
        });
        return rootView;
    }


    @Override
    public void onAttach( Context context) {
        mContext = context;
        super.onAttach(context);
    }

    @Override
    public void onClick(View view) {
        ImageView ivFace =(ImageView) view;
        showToast(ivFace.getDrawable());


    }
    private void innitViews(View view)
    {
        for (int id:ids){
            view.findViewById(id).setOnClickListener(this);
        }
    }
    private void showToast(Drawable drawable){
        Toast toast = new Toast(mContext);
        ImageView ivEmoji = new ImageView(mContext);
        ivEmoji.setImageDrawable(drawable);
        toast.setView(ivEmoji);
        toast.show();
    }
}
