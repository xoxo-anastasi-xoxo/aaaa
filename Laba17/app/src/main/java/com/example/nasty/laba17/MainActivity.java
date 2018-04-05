package com.example.nasty.laba17;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity
{

    private GestureDetector mGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind the gestureDetector to GestureListener
        mGestureDetector = new GestureDetector(this, new GestureListener());
    }

    // onTouch() method gets called each time you perform any touch event with screen
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //method onTouchEvent of GestureDetector class Analyzes the given motion event
        //and if applicable triggers the appropriate callbacks on the GestureDetector.OnGestureListener supplied.
        //Returns true if the GestureDetector.OnGestureListener consumed the event, else false.

        boolean eventConsumed=mGestureDetector.onTouchEvent(event);
        if (eventConsumed)
        {
            Toast.makeText(this,GestureListener.currentGestureDetected,Toast.LENGTH_LONG).show();
            return true;
        }
        else
            return false;
    }
}