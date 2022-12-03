package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class TestView extends View implements View.OnClickListener {

    private Context context;
    private LayoutInflater inflater;
    private Button btn1,btn2;
    private String name1,name2;
    private final String TAG ="TestView";
    private float x,y, dx =300,dy = 100;
    public TestView(Context context) {
        this(context,null);
        Log.d(TAG, "TestView: 0");
    }


    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Log.d(TAG, "TestView: 1");
        this.setOnClickListener(this);

    }

    private void init(Context context, AttributeSet attrs){

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LayoutInflater inflater = LayoutInflater.from(getContext());


        Paint p =new Paint();
        p.setColor(Color.GRAY);
        canvas.drawCircle(dx,dy,100,p);

    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: 1111");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
//                x = event.getX();
//                y = event.getY();


            case MotionEvent.ACTION_MOVE:
                dx = event.getX() -x ;
                dy = event.getY() -y;
                invalidate();
                break;

            case MotionEvent.ACTION_UP:

        }
        return true;
    }
}
