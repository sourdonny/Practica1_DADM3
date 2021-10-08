package com.example.practica1_dadm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer titleMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleMusic = MediaPlayer.create(MainActivity.this, R.raw.blackmamba);
        titleMusic.start();
    }

    public void Jugar(View view){
        Intent pregunta = new Intent(this, Pregunta.class);
        titleMusic.stop();
        startActivity(pregunta);
        finish();
    }

    public void Salir(View view){
        titleMusic.stop();
        finish();
    }
}