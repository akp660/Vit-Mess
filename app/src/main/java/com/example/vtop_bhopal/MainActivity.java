package com.example.vtop_bhopal;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageButton;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GifImageButton gifImageButton3 = findViewById(R.id.gifImageButton3);
        gifImageButton3.setOnClickListener(view -> open());

    }

    public void open(){
        Intent intent = new Intent(MainActivity.this,Foody.class);
        startActivity(intent);
    }
}