package com.enrique.caculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int op1,op2,resultado;
    String operador;

    public void Resultado(View view){
        TextView tvcalc=(TextView) findViewById(R.id.textView);
        op2=Integer.parseInt(tvcalc.getText().toString());

        switch (operador){
            case "+":
                resultado=op1+op2;
                break;
            case "-":
                resultado=op1-op2;
                break;
            case "*":
                resultado=op1*op2;
                break;
            case "/":
                resultado=op1/op2;
                break;
        }
        tvcalc.setText(resultado);
    }
}