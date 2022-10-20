package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }
    public void menu(View view){
        Intent intent = new Intent(this,MENU.class);
        startActivity(intent);
    }
    public void perfil(View view){
        Intent intent = new Intent(this,Perfil.class);
        startActivity(intent);
    }
    public void vegano(View view){
        Intent intent = new Intent(this,comida_vegana.class);
        startActivity(intent);
    }
    public void bebidas(View view){
        Intent intent = new Intent(this,Bebidas.class);
        startActivity(intent);
    }
    public void postres(View view){
        Intent intent = new Intent(this,Postres.class);
        startActivity(intent);
    }
    public void carne(View view){
        Intent intent = new Intent(this,Carnes.class);
        startActivity(intent);
    }
    public void vinos(View view){
        Intent intent = new Intent(this,Vinos.class);
        startActivity(intent);
    }
    public void ensalada(View view){
        Intent intent = new Intent(this,Ensaladas.class);
        startActivity(intent);
    }
}