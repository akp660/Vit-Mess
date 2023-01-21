package com.example.vtop_bhopal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Foody extends AppCompatActivity {

    public Foody() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foody);

        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(view -> open());

        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(view -> open());

    }

    public void open(){
        Intent intent = new Intent(Foody.this, mess_menu.class);
        startActivity(intent);
    }


}