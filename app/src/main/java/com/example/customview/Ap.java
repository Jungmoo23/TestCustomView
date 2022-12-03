package com.example.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Ap extends ArrayAdapter {

    ArrayList list ;
    Button btn1;

    public Ap(@NonNull Context context, int resource ,ArrayList arrayList) {
        super(context, resource);
        list =arrayList;
        initList();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =LayoutInflater.from(getContext());
        View v =  inflater.inflate(R.layout.customview_main,null,false);
        btn1 = v.findViewById(R.id.btn1);

        return super.getView(position, convertView, parent);
    }

    private void initList(){

        for(int i = 0; i<5;i++){
            list.add((i+1)+"");
        }
    }
}
