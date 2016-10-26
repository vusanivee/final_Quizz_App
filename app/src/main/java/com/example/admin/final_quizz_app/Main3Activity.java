package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public  class Main3Activity extends AppCompatActivity {
    RadioButton animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        animal=(RadioButton)findViewById(R.id.fruit_grape);
    }


    public void next(View v) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void hint(View v) {

        Toast.makeText(this, "King of the Jungle .", Toast.LENGTH_LONG).show();

    }

}
