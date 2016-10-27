package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    int score = 0;
    RadioButton grape, banana, orange, pear;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        grape = (RadioButton) findViewById(R.id.fruit_grape);
        banana = (RadioButton) findViewById(R.id.fruit_banana);
        orange = (RadioButton) findViewById(R.id.fruit_orange);
        pear = (RadioButton) findViewById(R.id.fruit_pear);


        grape.setOnCheckedChangeListener(this);
        banana.setOnCheckedChangeListener(this);
        orange.setOnCheckedChangeListener(this);
        banana.setOnCheckedChangeListener(this);
        intent = new Intent(Main2Activity.this, Main3Activity.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.fruit_grape:
                score++;
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.fruit_banana:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.fruit_pear:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.fruit_orange:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

        }
    }

    public void hint(View v) {

        Toast.makeText(this, "USED TO MAKE WINE.", Toast.LENGTH_LONG).show();
    }
}
