package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    RadioButton cartoon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        cartoon=(RadioButton)findViewById(R.id.minion);
    }
    public void next(View v) {
        Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
        startActivity(intent);
    }
    public void hint(View v) {

        Toast.makeText(this, "dispicable me.", Toast.LENGTH_LONG).show();

    }

}
