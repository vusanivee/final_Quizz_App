package com.example.admin.final_quizz_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
public class Main3Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


    int score = 0;
    RadioButton lion, tiger, zebra, dog;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lion = (RadioButton) findViewById(R.id.lion);
        tiger = (RadioButton) findViewById(R.id.tiger);
        zebra = (RadioButton) findViewById(R.id.zebra);
        dog = (RadioButton) findViewById(R.id.dog);


        lion.setOnCheckedChangeListener(this);
        tiger.setOnCheckedChangeListener(this);
        zebra.setOnCheckedChangeListener(this);
        dog.setOnCheckedChangeListener(this);
        intent = new Intent(Main3Activity.this, Main4Activity.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.lion:
                score++;
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.tiger:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.zebra:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;
            case R.id.dog:
                Toast.makeText(this, "your score is:" + score, Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

        }

    }

    public void hint(View v) {

        Toast.makeText(this, "king of the jungle.", Toast.LENGTH_LONG).show();

    }
}