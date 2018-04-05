package com.example.nasty.lab18;

import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements GestureOverlayView.OnGesturePerformedListener {
    private TextView mResults;
    private GestureLibrary mGestureLibrary;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Связываемся с нашими объектами интерфейса:
        mResults=findViewById(R.id.results);

        //Инициализируем библиотеку жестов, которые мы создали
        //в программе GestureBuilder и взяли оттуда файл с жестами:
        mGestureLibrary= GestureLibraries.fromRawResource(this, R.raw.gestures);
        if (!mGestureLibrary.load()) finish();

        //Инициализируем объект GestureOverlayView интерфейса приложения
        //и устанавливаем для него слушателя нарисованных жестов:
        GestureOverlayView gestures=findViewById(R.id.draw_gestures);
        gestures.addOnGesturePerformedListener(this);
    }

    //Обрабатываем рисование жестов в области GestureOverlayView:
    public void onGesturePerformed(GestureOverlayView overlay,Gesture gesture) {

        //Здесь выполняется сравнение нарисованных пользователем
        //каракулей с заданными в библиотеке жестов (файле gestures), и после сравнения
        //выдается массив с цифрами, указывающими наибольшее сходство нарисованного с заданным в файле:
        ArrayList<Prediction> predictions = mGestureLibrary.recognize(gesture);
        String  predictList = predictions.get(0).name;

        //Результаты сравнений отображаем в элементе TextView:
        mResults.setText(predictList);
    }
}
