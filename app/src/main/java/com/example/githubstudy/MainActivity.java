package com.example.githubstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newFunction(){

        Toast.makeText(MainActivity.this, "Branch 01", Toast.LENGTH_SHORT).show();
        String message = "Hello Everyone";
    }
}
