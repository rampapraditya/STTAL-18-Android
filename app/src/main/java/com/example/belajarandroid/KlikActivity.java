package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KlikActivity extends AppCompatActivity {

    EditText txtNama;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klik);

        btn1 = findViewById(R.id.btn1);
        txtNama = findViewById(R.id.txtNama);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = txtNama.getText().toString();

                Toast.makeText(KlikActivity.this, "Nama saya " + nama, Toast.LENGTH_SHORT).show();
            }
        });
    }
}