package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void registrar(View view){
        Intent intent = new Intent(this,Inicio.class);
        startActivity(intent);
    }
    public void volver(View view){
        Intent intent = new Intent(this,Inicio.class);
        startActivity(intent);
    }
}