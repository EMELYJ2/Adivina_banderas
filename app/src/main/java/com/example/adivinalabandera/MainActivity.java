package com.example.adivinalabandera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     MediaPlayer audio;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botoniniciar (View view) {
        Toast.makeText(getApplicationContext(), "Iniciando", Toast.LENGTH_SHORT).show();
        Intent botoniniciar =new Intent(this, a.class);
        startActivity(botoniniciar);
    }
}