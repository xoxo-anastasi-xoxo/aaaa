package com.example.nasty.lab19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ExplosionField explosionField = ExplosionField.attach2Window(this);
        explosionField.expandExplosionBound(100,100);

        final TextView txt = findViewById(R.id.txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
        final TextView txt_2 = findViewById(R.id.textView);
        txt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
        final TextView txt_3 = findViewById(R.id.textView2);
        txt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(view);
            }
        });
    }
}
