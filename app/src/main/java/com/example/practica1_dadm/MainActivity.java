package com.example.practica1_dadm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jugar(View view){
        Intent pregunta = new Intent(this, Pregunta.class);
        startActivity(pregunta);
    }

    public void Salir(View view){
        finish();
    }
}