package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    public void menu(View view){
        Intent intent = new Intent(this,MENU.class);
        startActivity(intent);
    }
    public void lista(View view){
        Intent intent = new Intent(this,Lista.class);
        startActivity(intent);
    }
}