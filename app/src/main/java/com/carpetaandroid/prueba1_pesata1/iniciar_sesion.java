package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class iniciar_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }
    public void ingresar(View view){
        Intent intent = new Intent(this,MENU.class);
        startActivity(intent);
    }
    public void volver(View view){
        Intent intent = new Intent(this,Inicio.class);
        startActivity(intent);
    }
}