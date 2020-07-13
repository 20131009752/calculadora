package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText txt_numero1;
    private EditText txt_numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_numero1 = findViewById(R.id.txtNumero1);
        txt_numero2 = findViewById(R.id.txtNumero2);
        resultado = findViewById(R.id.lblResultado);
    }

    public void onClickSumar(View view){
        double suma = 0;
        double numero1 = Double.parseDouble(txt_numero1.getText().toString());
        double numero2 = Double.parseDouble(txt_numero2.getText().toString());
        suma = numero1 + numero2;
        resultado.setText(
                String.valueOf(numero1)+ " + " +
                String.valueOf(numero2)+ " = " +
                        String.valueOf(suma));
    }

    public void onClickRestar(View view){
        double resta = 0;
        double numero1 = Double.parseDouble(txt_numero1.getText().toString());
        double numero2 = Double.parseDouble(txt_numero2.getText().toString());
        resta = numero1 - numero2;
        resultado.setText(
                String.valueOf(numero1)+ " - " +
                        String.valueOf(numero2)+ " = " +
                        String.valueOf(resta));
    }

    public void onClickMultiplicar(View view){
        double multiplicacion = 0;
        double numero1 = Double.parseDouble(txt_numero1.getText().toString());
        double numero2 = Double.parseDouble(txt_numero2.getText().toString());
        multiplicacion = numero1 * numero2;
        resultado.setText(
                String.valueOf(numero1)+ " * " +
                        String.valueOf(numero2)+ " = " +
                        String.valueOf(multiplicacion));
    }

    public void onClickDividir(View view){
        double division = 0;
        double numero1 = Double.parseDouble(txt_numero1.getText().toString());
        double numero2 = Double.parseDouble(txt_numero2.getText().toString());
        division = numero1 / numero2;
        resultado.setText(
                String.valueOf(numero1)+ " / " +
                        String.valueOf(numero2)+ " = " +
                        String.valueOf(division));
    }

    public void onClickPotencia(View view){
        double potencia = 0;
        double numero1 = Double.parseDouble(txt_numero1.getText().toString());
        double numero2 = Double.parseDouble(txt_numero2.getText().toString());
        potencia = Math.pow(numero1,numero2);
        resultado.setText(
                String.valueOf(numero1)+ " ^ " +
                        String.valueOf(numero2)+ " = " +
                        String.valueOf(potencia));
    }
}