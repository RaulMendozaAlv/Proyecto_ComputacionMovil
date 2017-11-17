    package com.raulmendoza.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrMapa(View view){
        Intent intent = new Intent(this, MenuNavegador.class);
        startActivity(intent);
    }

    public void IrCrearCuenta(View view){
        Intent intent = new Intent(this, Crear_Cuenta.class);
        startActivity(intent);
    }

}
