package com.example.nasty.laba03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements OnClickListener  {
    Button btnActTwo;
    EditText name;
    static String context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = findViewById(R.id.btnActTwo);
        name = findViewById(R.id.name);
        name.setText(context);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                context = name.getText().toString();
                Intent intent = new Intent(this, ActivityTwo.class);
                //Создаем данные для передачи:
                intent.putExtra("name", context);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
