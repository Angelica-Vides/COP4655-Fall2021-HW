package com.example.hw8_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView city;
    TextView temp;
    TextView min;
    TextView max;
    TextView feels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        WeatherData w = MainActivity.getWeatherInstance();
        city = findViewById(R.id.cityView);
        temp = findViewById(R.id.tempView);
        min =  findViewById(R.id.minView);
        feels = findViewById(R.id.feelsView);
        max = findViewById(R.id.maxView);

        city.setText("Weather for " + w.getCityName());
        temp.setText("Temperature : " + String.valueOf(Math.floor(KtoF(Double.parseDouble(w.getTemp())))) + "F");
        min.setText("Low : " + String.valueOf(Math.floor(KtoF(Double.parseDouble(w.getTempMin()))))+ "F");
        max.setText("Maximum : " + String.valueOf(Math.floor(KtoF(Double.parseDouble(w.getTempMax())))) + "F");
        feels.setText("Feels like : " + String.valueOf(Math.floor(KtoF(Double.parseDouble(w.getFeelsLike()))))+ "F");









    }

    public static double KtoF(Double k){
        return ((k - 273.15) * 9/5 + 32);
    }
}