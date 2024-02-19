package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Halaman2Activity extends AppCompatActivity {

    Button btn2;
    TextView input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        btn2 = findViewById(R.id.btn2);
        input = findViewById(R.id.input);

        // menerima inputan dari halaman lain
        Intent nilaidari_halLain = getIntent();
        input.setText(nilaidari_halLain.getStringExtra("AAA"));


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKeHal2 = new Intent(Halaman2Activity.this,
                        Halaman3Activity.class);
                startActivity(intentKeHal2);
            }
        });
    }
}