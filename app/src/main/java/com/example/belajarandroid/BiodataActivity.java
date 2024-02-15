package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        EditText nrp = findViewById(R.id.nrp);
        EditText nama = findViewById(R.id.nama);
        EditText prodi = findViewById(R.id.prodi);

        Button simpan = findViewById(R.id.simpan);
        Button batal = findViewById(R.id.batal);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}