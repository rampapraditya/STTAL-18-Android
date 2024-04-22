package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GetDataActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnGetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        btnGetData = findViewById(R.id.btnGetData);
        btnGetData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnGetData){
            Toast.makeText(this, "Sudah di klik", Toast.LENGTH_SHORT).show();
        }
    }
}