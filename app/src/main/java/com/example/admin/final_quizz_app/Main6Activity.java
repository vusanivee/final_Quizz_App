package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    RadioButton pres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pres=(RadioButton)findViewById(R.id.obama);
    }


    public void next(View v) {
        Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
        startActivity(intent);
    }
    public void hint(View v) {

        Toast.makeText(this, "1st American black president.", Toast.LENGTH_LONG).show();

    }

}