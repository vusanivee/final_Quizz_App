package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Main4Activity extends AppCompatActivity {
    RadioButton color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        color=(RadioButton)findViewById(R.id.blue);
    }

    public void hint(View v) {

        Toast.makeText(this, "color of the sky and sea.", Toast.LENGTH_LONG).show();


    }

    public void next(View v) {
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}