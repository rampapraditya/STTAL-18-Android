package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman1Activity extends AppCompatActivity {

    Button btnKlik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        btnKlik = findViewById(R.id.btnKlik);
        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fungsinya pindah halaman
                Intent intentKeHal2 = new Intent(Halaman1Activity.this,
                        Halaman2Activity.class);
                startActivity(intentKeHal2);
            }
        });
    }
}