package com.natasya.myintentapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove,btnData,btnCall,btnWeb,btnLearn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btn_move_act);
        btnData=findViewById(R.id.btn_move_data);
        btnCall = findViewById(R.id.btn_dial_phone);
        btnWeb = findViewById(R.id.btn_polines);
        btnLearn = findViewById(R.id.btn_learn);


        btnMove.setOnClickListener(this);
        btnData.setOnClickListener(this);
        btnCall.setOnClickListener(this);
        btnWeb.setOnClickListener(this);
        btnLearn.setOnClickListener(this);
//        btnMove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,NewActivity.class));
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_act:
                Intent moveActivity = new Intent(MainActivity.this,NewActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                startActivity(new Intent(MainActivity.this,MoveActivityWithData.class).putExtra(MoveActivityWithData.EXTRA_NAME,"Muhammad Irhamul Umam").putExtra(MoveActivityWithData.EXTRA_AGE,18));
                break;
            case R.id.btn_dial_phone:
                String phoneNumber = "085290773030";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber)));
                break;
            case R.id.btn_polines:
                String webPolines = "http://www.polines.ac.id";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(webPolines)));
                break;
            case R.id.btn_learn:
                startActivity(new Intent(MainActivity.this,InputActivity.class));
                break;
        }
    }
}

