package com.enrique.caculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnigual,btnsuma,btnresta,btnmultiplicacion,btndivision,btnc,btndel,btncoma;
    TextView tv;
    String operador,cad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button11);
        btn3 = (Button) findViewById(R.id.button12);
        btn4 = (Button) findViewById(R.id.button7);
        btn5 = (Button) findViewById(R.id.button8);
        btn6 = (Button) findViewById(R.id.button9);
        btn7 = (Button) findViewById(R.id.button4);
        btn8 = (Button) findViewById(R.id.button5);
        btn9 = (Button) findViewById(R.id.button6);
        btnsuma = (Button) findViewById(R.id.button14);
        btnresta = (Button) findViewById(R.id.button15);
        btnmultiplicacion = (Button) findViewById(R.id.button13);
        btndivision = (Button) findViewById(R.id.button3);
        btnc=(Button) findViewById(R.id.button);
        btndel=(Button) findViewById(R.id.button2);
        btncoma=(Button) findViewById(R.id.button17);
        btnigual = (Button) findViewById(R.id.button16);
        tv = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cad+=tv.getText();
            }
        });

    }

    public int MetodoCalcularResultado(int op1, int op2, String operador) {
        int resultado = 0;
        TextView tvcalc = (TextView) findViewById(R.id.textView);
        op1 = Integer.parseInt(tvcalc.getText().toString());
        op2 = Integer.parseInt(tvcalc.getText().toString());

        switch (operador) {
            case "+":
                resultado = op1 + op2;
                break;
            case "-":
                resultado = op1 - op2;
                break;
            case "*":
                resultado = op1 * op2;
                break;
            case "/":
                resultado = op1 / op2;
                break;
        }
        return resultado;
    }
}