package com.carpetaandroid.prueba1_pesata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void lista(View view){
        Intent intent = new Intent(this,Lista.class);
        startActivity(intent);
    }
    public void perfil(View view){
        Intent intent = new Intent(this,Perfil.class);
        startActivity(intent);
    }

}