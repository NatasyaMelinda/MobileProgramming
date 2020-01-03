package com.natasya.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {
    TextView txtKata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        txtKata = findViewById(R.id.txt_kata);
        String data = getIntent().getStringExtra("data");
        txtKata.setText(data);
    }
}