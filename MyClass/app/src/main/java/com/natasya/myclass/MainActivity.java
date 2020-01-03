package com.natasya.myclass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LihatData = findViewById(R.id.lihatbtn);
        Button InputData = findViewById(R.id.inputbtn);
        Button informasi = findViewById(R.id.infobtn);
        LihatData.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, DataMahasiswa.class);
                startActivity(inte);
                }
});
        InputData.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, InputData.class);
                startActivity(inte);
                }
});
        informasi.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, Informasi.class);
                startActivity(inte);
                }
});
        }
}

