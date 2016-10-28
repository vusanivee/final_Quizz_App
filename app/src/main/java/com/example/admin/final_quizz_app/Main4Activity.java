package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    int score = 0;
    RadioButton red,blue,yellow,pink;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        red = (RadioButton) findViewById(R.id.red);
        blue = (RadioButton) findViewById(R.id.blue);
        yellow = (RadioButton) findViewById(R.id.yellow);
        pink= (RadioButton) findViewById(R.id.pink);


        red.setOnCheckedChangeListener(this);
        blue.setOnCheckedChangeListener(this);
        yellow.setOnCheckedChangeListener(this);
        pink.setOnCheckedChangeListener(this);
        intent = new Intent(Main4Activity.this, Main5Activity.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        
        switch (buttonView.getId()) {
            case R.id.blue:
                score++;
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.red:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.yellow:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.pink:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

        }

    }

    public void hint(View v) {

        Toast.makeText(this, "colour of sky and water.", Toast.LENGTH_LONG).show();

    }}
