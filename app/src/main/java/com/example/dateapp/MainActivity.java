package com.example.dateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create instance of Calendar
        Calendar calendar = Calendar.getInstance();

        //save the current date as a string
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        //create reference to text view
        TextView textViewDate = findViewById(R.id.text_view_date);

        //pass in current date
        textViewDate.setText(currentDate);

        //TIMESTAMP CODE -------------------

        //get current Epoch timestamp
        Long tsLong = System.currentTimeMillis()/1000;
        String ts = tsLong.toString();

        //Another way of doing it (without dividing by 1000)
        //String ts = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));

        //create reference to text view
        TextView timestamp = findViewById(R.id.text_view_timestamp);

        //pass in current date
        timestamp.setText(ts);



    }
}