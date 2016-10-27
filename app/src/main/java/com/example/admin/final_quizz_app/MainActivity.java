package com.example.admin.final_quizz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public Button btnPress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPress = (Button)findViewById(R.id.button);
        btnPress.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
       if(v.getId() == R.id.button)
       {
           Intent intent = new Intent(getBaseContext(),Main2Activity.class);
           startActivity(intent);
       }
    }
}