package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botones_direccionales_damian_jinel);
    }
    public void menu(View view){
    Intent intent = new Intent(this,HOME.class);
    startActivity(intent);
    }
    public void lista(View view){
        Intent intent = new Intent(this,Listas.class);
        startActivity(intent);
    }
    public void perfil(View view){
        Intent intent = new Intent(this,Perfil.class);
        startActivity(intent);
    }
    public void promo(View view){
        Intent intent = new Intent(this,Promos.class);
        startActivity(intent);
    }
}