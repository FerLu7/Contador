package com.fldc.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int valorContador;
    private TextView contador;
    Button botonMas, botonMenos, botonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorContador = 0;
        // recuperamos el texto en el que escribiremos el valor
        contador = findViewById(R.id.contador);


        // 1. buscamos el elemento al que escucha el evento (donde aplicaremos el listener)
        // y llamamos al metodo que incrementa

        botonMas = findViewById(R.id.incrementar);
        findViewById(R.id.incrementar).setOnClickListener(view -> {
            incrementar();

        });
        // TODO buscar el elemento que decementa
        botonMenos = findViewById(R.id.decrementar);
        findViewById(R.id.decrementar).setOnClickListener(view -> {
        decrementar();

        });
        // TODO buscar el elemento que resetea
        botonReset = findViewById(R.id.resetear);
        findViewById(R.id.resetear).setOnClickListener(view ->resetear());

    }
    private void incrementar() {
        valorContador++;
        contador.setText(Integer.toString(valorContador));
    }
    private void decrementar() {
        valorContador--;
        contador.setText(Integer.toString(valorContador));
    }
    private void resetear() {
        valorContador=0;
        contador.setText(Integer.toString(valorContador));
    }
}
