package com.example.vtop_bhopal;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list_view extends AppCompatActivity {
   // ListView listView;
    Spinner spinner;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrDays = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);

        /*
        arrNames.add("Monday");
        arrNames.add("Tuesday");
        arrNames.add("Wednesday");
        arrNames.add("Thursday");
        arrNames.add("Friday");
        arrNames.add("Saturday");
        arrNames.add("Sunday");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

         @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent intent = new Intent(list_view.this, mess_menu.class);
                    startActivity(intent);
               }
                else if (position==1){
                    Intent intent = new Intent(list_view.this, Tue_menu.class);
                    startActivity(intent);
                }
                else if (position==2){
                    Intent intent = new Intent(list_view.this, wed_menu.class);
                    startActivity(intent);
                }
                else if (position==3){
                    Intent intent = new Intent(list_view.this, Thu_menu.class);
                    startActivity(intent);
                }
                else if (position==4){
                    Intent intent = new Intent(list_view.this, fri_menu.class);
                    startActivity(intent);
                }
                else if (position==5){
                    Intent intent = new Intent(list_view.this, sat_menu.class);
                    startActivity(intent);
                }
                else if (position==6){
                    Intent intent = new Intent(list_view.this, sun_menu.class);
                    startActivity(intent);
                }
            }
        });
         */
        //  Code for Spinner

        arrDays.add("Monday");
        arrDays.add("Tuesday");
        arrDays.add("Wednesday");
        arrDays.add("Thursday");
        arrDays.add("Friday");
        arrDays.add("Saturday");
        arrDays.add("Sunday");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrDays);
        spinner.setAdapter(spinnerAdapter);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String item = spinner.getSelectedItem().toString();
                Intent intent = new Intent(list_view.this, sat_menu.class);
                startActivity(intent);
            }
        });

    }
}