package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    Button btn1;
    ArrayList list;

    float x,y,dx,dy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestView testView  = (TestView)findViewById(R.id.testview);
        list = new ArrayList();
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.customview_main,null);
        btn1 = view.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: T2q");
            }
        });
        FrameLayout fr = findViewById(R.id.frame);
        fr.addView(view);



    }


    private void init(){

    }
}