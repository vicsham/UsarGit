package com.example.usargit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadUI();
    }
    private void loadUI(){
        TextView txtTitulo = findViewById(R.id.txtTitle);
        Button btnAccion = findViewById(R.id.btnAccion);
    }
}