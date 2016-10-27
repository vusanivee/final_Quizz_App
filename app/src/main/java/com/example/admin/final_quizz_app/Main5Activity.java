package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;


public class Main5Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    int score = 0;
    RadioButton spongebob,ben,minion,mickey;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ben = (RadioButton) findViewById(R.id.ben10);
        mickey = (RadioButton) findViewById(R.id.mickey);
        minion = (RadioButton) findViewById(R.id.minion);
        spongebob= (RadioButton) findViewById(R.id.spongebob);


        ben.setOnCheckedChangeListener(this);
        minion.setOnCheckedChangeListener(this);
        mickey.setOnCheckedChangeListener(this);
        spongebob.setOnCheckedChangeListener(this);
        intent = new Intent(Main5Activity.this, Main6Activity.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.ben10:
                score++;
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.mickey:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.minion:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.spongebob:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

        }

    }

    public void hint(View v) {

        Toast.makeText(this, "dispicable me.", Toast.LENGTH_LONG).show();

    }}

