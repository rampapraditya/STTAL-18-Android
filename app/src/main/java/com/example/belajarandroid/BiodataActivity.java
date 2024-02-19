package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // memanggil semua komponen yang ada di XML
        EditText nrp = findViewById(R.id.nrp);
        EditText nama = findViewById(R.id.nama);
        EditText prodi = findViewById(R.id.prodi);

        Button simpan = findViewById(R.id.simpan);
        Button batal = findViewById(R.id.batal);

        // memberikan event klik pada komponen button
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = nrp.getText().toString();
                String v2 = nama.getText().toString();
                String v3 = prodi.getText().toString();

                String gabung = v1 + "\n" + v2 + "\n" + v3;
                Toast.makeText(BiodataActivity.this, gabung, Toast.LENGTH_SHORT).show();

            }
        });

    }
}