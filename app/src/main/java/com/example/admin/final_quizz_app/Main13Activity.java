package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main13Activity extends AppCompatActivity {
    private int score = 0;
    private  TextView finalscores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        score = getIntent().getIntExtra("score",0);
        finalscores = (TextView)findViewById(R.id.finalscoreTextView);
        finalscores.setText(String.valueOf(score));
    }

}
