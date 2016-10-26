package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioButton fruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fruit=(RadioButton)findViewById(R.id.fruit_grape);
    }


    public void next(View v) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void hint(View v) {

        Toast.makeText(this, "used to make wine .", Toast.LENGTH_LONG).show();

    }

}
