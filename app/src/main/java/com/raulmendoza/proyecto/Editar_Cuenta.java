package com.raulmendoza.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Editar_Cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar__cuenta);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        
        switch (id){
            case android.R.id.home: 
                finish();
                break;
            case R.id.item_save:
                guardarContacto();
                break;
            default:
                break;
        }
                
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_editar_cuenta, menu);
        return true;
    }

    private void guardarContacto() {
        Toast.makeText(this,"Contacto Guardado",Toast.LENGTH_SHORT).show();
        finish();

    }
}
