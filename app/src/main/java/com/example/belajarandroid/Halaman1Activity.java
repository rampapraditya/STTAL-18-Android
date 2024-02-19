package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Halaman1Activity extends AppCompatActivity {

    Button btnKlik, btnKeluar;
    TextView lupa;
    EditText inputan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        btnKlik = findViewById(R.id.btnKlik);
        inputan = findViewById(R.id.inputan);
        btnKeluar = findViewById(R.id.btnKeluar);
        lupa = findViewById(R.id.lupa);

        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fungsinya pindah halaman
                Intent hal2 = new Intent(Halaman1Activity.this, Halaman2Activity.class);
                hal2.putExtra("AAA", inputan.getText().toString()); // lempar inputan ke halaman lain
                startActivity(hal2);
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}