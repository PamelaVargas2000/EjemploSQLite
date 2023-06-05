package com.example.cuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }
    public void Salir(View view) {
        this.finish();

    }

    public void Area(View view) {
        EditText numero1 = (EditText) findViewById(R.id.TxtNum1);

        TextView total = findViewById(R.id.btnResultadoA);


        double resultado = Double.parseDouble(numero1.getText().toString()) * Double.parseDouble(numero1.getText().toString());
        total.setText(resultado + "");

    }

}