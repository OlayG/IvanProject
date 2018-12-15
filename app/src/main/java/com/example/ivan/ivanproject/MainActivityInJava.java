package com.example.ivan.ivanproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityInJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_in_java);
        Toast.makeText(this, "Congrats looks like you were able to run the project!", Toast.LENGTH_LONG).show();
    }
}
