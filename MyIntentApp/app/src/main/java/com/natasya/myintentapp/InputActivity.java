package com.natasya.myintentapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText edtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        btnSubmit = findViewById(R.id.btn_submit);
        edtText = findViewById(R.id.edt_text);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtText.getText().toString().matches("")){
                    Toast.makeText(InputActivity.this, "Lengkapi Data", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(InputActivity.this,ReadActivity.class).putExtra("data",edtText.getText().toString()));
                    edtText.setText("");
                }
            }
        });
    }
}
