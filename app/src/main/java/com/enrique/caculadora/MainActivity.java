package com.enrique.caculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnigual,btnsuma,btnresta,btnmultiplicacion,btndivision,btnc,btndel,btncoma;
    TextView tv;
    String operador,op1="",op2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.button18);
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

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("0");
                tv.getText();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("1");
                tv.getText();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("2");
                tv.getText();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("3");
                tv.getText();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("4");
                tv.getText();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("5");
                tv.getText();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("6");
                tv.getText();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("7");
                tv.getText();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("8");
                tv.getText();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("9");
                tv.getText();
            }
        });
        btncoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(".");
                tv.getText();
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        
    }

    public int MetodoCalcularResultado(int op1, int op2, String operador) {
        int resultado = 0;
        op1 = Integer.parseInt(tv.getText().toString());
        op2 = Integer.parseInt(tv.getText().toString());

        switch (operador) {
            case "+":
                resultado = op1 + op2;
                tv.setText(resultado);
                break;
            case "-":
                resultado = op1 - op2;
                tv.setText(resultado);
                break;
            case "*":
                resultado = op1 * op2;
                tv.setText(resultado);
                break;
            case "/":
                resultado = op1 / op2;
                tv.setText(resultado);
                break;
        }
        return resultado;
    }
}