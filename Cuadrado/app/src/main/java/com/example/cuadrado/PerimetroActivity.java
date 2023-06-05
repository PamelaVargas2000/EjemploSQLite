package com.example.cuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro);
    }
    public void Salir(View view) {
        this.finish();

    }

    public void Perimetro(View view) {
        EditText numero1 = (EditText) findViewById(R.id.txtNum2);

        TextView total = findViewById(R.id.btnResultadoA);


        double resultado = Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero1.getText().toString())+Double.parseDouble(numero1.getText().toString()) + Double.parseDouble(numero1.getText().toString()) ;
        total.setText(resultado + "");

    }

}