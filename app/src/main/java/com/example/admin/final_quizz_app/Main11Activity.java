package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main11Activity extends AppCompatActivity {
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        score = getIntent().getIntExtra("score",0);
    }
    public  void next(View v){
        score += 10;
        Intent intent = new Intent(getBaseContext(),Main12Activity.class);
        intent.putExtra("score",score);
        startActivity(intent);
    }
}
