package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void iniciar_sesion(View view){
        Intent intent = new Intent(this,iniciar_sesion.class);
        startActivity(intent);
    }
    public void registro(View view){
        Intent intent = new Intent(this,Registro.class);
        startActivity(intent);
    }
    /*public void menu(View view){
    Intent intent = new Intent(this, MENU.class);
    startActivity(intent);
    }
    public void lista(View view){
        Intent intent = new Intent(this, Lista.class);
        startActivity(intent);
    }
    public void perfil(View view){
        Intent intent = new Intent(this,Perfil.class);
        startActivity(intent);
    }
    public void promo(View view){
        Intent intent = new Intent(this, Lista.class);
        startActivity(intent);
    }
    public void regresar(View view){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }*/
}