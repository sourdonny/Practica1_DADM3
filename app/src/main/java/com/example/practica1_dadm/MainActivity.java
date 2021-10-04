package com.example.practica1_dadm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView pressedJugar;
    ImageView pressedSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pressedJugar = findViewById(R.id.pr);
    }

    public void Jugar(View view){
        Intent pregunta = new Intent(this, Pregunta.class);
        startActivity(pregunta);
    }

    public void Salir(View view){
        finish();
    }
}