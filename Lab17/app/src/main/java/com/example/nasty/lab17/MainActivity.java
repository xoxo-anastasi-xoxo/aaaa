package com.example.nasty.lab17;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView txt;
    private GestureDetectorCompat gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.text);
        gd = new GestureDetectorCompat(this, this);
        gd.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gd.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        txt.setText("onSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        txt.setText("onDoubleTap");

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        txt.setText("onDoubleTapEvent");

        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        txt.setText("onDown");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        txt.setText("onShowPress");


    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        txt.setText("onSingleTapUp");

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            txt.setText("onScroll");

        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        txt.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        txt.setText("onFling");
        return false;
    }
}
