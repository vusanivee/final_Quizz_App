package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
public class Main6Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    int score = 0;
    RadioButton mbeki,zuma,obama,mandela;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mbeki = (RadioButton) findViewById(R.id.mbeki);
        zuma= (RadioButton) findViewById(R.id.zuma);
        obama = (RadioButton) findViewById(R.id.obama);
        mandela= (RadioButton) findViewById(R.id.mandela);


        mbeki.setOnCheckedChangeListener(this);
        zuma.setOnCheckedChangeListener(this);
        obama.setOnCheckedChangeListener(this);
        mandela.setOnCheckedChangeListener(this);
        intent = new Intent(Main6Activity.this, Main7Activity.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.mbeki:
                score++;
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.zuma:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.obama:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.mandela:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

        }

    }

    public void hint(View v) {

        Toast.makeText(this, "1st American black president.", Toast.LENGTH_LONG).show();

    }}
