package com.example.di.foodtracker;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Context mainContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testButton = findViewById(R.id.testButton);

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(mainContext);
                                    builder.setTitle("Hi, hellow!")
                                            .setMessage("How are you today?")
                                            .setPositiveButton("Good, thanks",null)
                                            .setNegativeButton("Bye",null)
                                            .show();
            }
        });
    }
}
