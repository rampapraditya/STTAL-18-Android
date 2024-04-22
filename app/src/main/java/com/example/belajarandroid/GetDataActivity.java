package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

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
            load_data("https://senjata.d3informatika-sttal.com/ws/loadpengajuan");
        }
    }

    private void load_data(String url) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                response -> {
                    try {
                        Log.d("INFO", response);
                    } catch (Exception e) {
                        Toast.makeText(GetDataActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                },
                error -> {
                    Toast.makeText(GetDataActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.clear();
                return params;
            }
        };
        Volley.newRequestQueue(GetDataActivity.this).add(stringRequest);
    }
}