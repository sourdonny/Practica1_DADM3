package com.example.practica1_dadm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void VolverMenuPrincipal(View view){
        Intent menuPrincipal = new Intent(this, MainActivity.class);
        startActivity(menuPrincipal);
        finish();
    }
}