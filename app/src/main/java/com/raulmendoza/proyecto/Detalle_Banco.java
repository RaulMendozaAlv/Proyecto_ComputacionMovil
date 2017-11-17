package com.raulmendoza.proyecto;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.raulmendoza.proyecto.R;

import java.sql.Time;

public class Detalle_Banco extends AppCompatActivity {


    private TimePickerDialog.OnTimeSetListener mTimeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle__banco);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                Toast.makeText(this,"Saliendo",Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void IrSetTime(View view) {
        //Toast.makeText(this,"Tiempo", Toast.LENGTH_SHORT).show();
        NumberPicker mNumberPicker = new NumberPicker(this);
        mNumberPicker.setMaxValue(60);
        mNumberPicker.setMinValue(5);

        NumberPicker.OnValueChangeListener mValue = new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {

            }
        };
        mNumberPicker.setOnValueChangedListener(mValue);
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setView(mNumberPicker);
        builder.setTitle("Tiempo de espera").setIcon(R.drawable.ic_action_time);

        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }
}
