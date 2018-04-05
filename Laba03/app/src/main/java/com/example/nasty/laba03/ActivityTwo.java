package com.example.nasty.laba03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity  implements View.OnClickListener {
    TextView user_name;
    Button btnActOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        user_name = findViewById(R.id.user_name);

        //Получаем текстовые данные с первого Activity:
        String Name = getIntent().getStringExtra("name");

        user_name.setText("Name: " + Name);


        btnActOne = findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                this.finish();
                break;
            default:
                break;
        }
    }
}
