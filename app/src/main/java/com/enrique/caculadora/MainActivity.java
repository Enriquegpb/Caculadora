package com.enrique.caculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnigual,btnsuma,btnresta,btnmultiplicacion,btndivision,btnc,btndel,btncoma;
    TextView tv;
    String operador,op1="",op2="";
    Switch sw;
    ConstraintLayout cl;
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
        sw=(Switch)findViewById(R.id.sw);
        cl=(ConstraintLayout)findViewById(R.id.contenedor);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv.getText().equals("0")){
                    tv.setText("0");
                }else
                tv.setText(tv.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+"9");
            }
        });
        btncoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+".");
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=tv.getText().toString();
                operador="+";
                tv.setText("");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=tv.getText().toString();
                operador="-";
                tv.setText("");
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=tv.getText().toString();
                operador="*";
                tv.setText("");
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1=tv.getText().toString();
                operador="/";
                tv.setText("");
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2=tv.getText().toString();
                tv.setText(String.valueOf(MetodoCalcularResultado(Double.parseDouble(op1),Double.parseDouble(op2),operador)));

            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
                op1="";
                op2="";
                operador="";
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText().subSequence(0,tv.getText().length()-1));
            }
        });
        //sw.setBackgroundColor(Color.GRAY);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sw.isChecked()){
                    sw.setText("on");
                    sw.setBackgroundColor(Color.GRAY);
                    cl.setBackgroundColor(Color.DKGRAY);
                    btn0.setBackgroundColor(Color.YELLOW);
                    btn1.setBackgroundColor(Color.YELLOW);
                    btn2.setBackgroundColor(Color.YELLOW);
                    btn3.setBackgroundColor(Color.YELLOW);
                    btn4.setBackgroundColor(Color.YELLOW);
                    btn5.setBackgroundColor(Color.YELLOW);
                    btn6.setBackgroundColor(Color.YELLOW);
                    btn7.setBackgroundColor(Color.YELLOW);
                    btn8.setBackgroundColor(Color.YELLOW);
                    btn9.setBackgroundColor(Color.YELLOW);
                    btnsuma.setBackgroundColor(Color.YELLOW);
                    btnresta.setBackgroundColor(Color.YELLOW);
                    btnmultiplicacion.setBackgroundColor(Color.YELLOW);
                    btndivision.setBackgroundColor(Color.YELLOW);
                    btnigual.setBackgroundColor(Color.YELLOW);
                    btncoma.setBackgroundColor(Color.YELLOW);
                    btndel.setBackgroundColor(Color.YELLOW);
                    btnc.setBackgroundColor(Color.YELLOW);
                    btn0.setTextColor(Color.DKGRAY);
                    btn1.setTextColor(Color.DKGRAY);
                    btn2.setTextColor(Color.DKGRAY);
                    btn3.setTextColor(Color.DKGRAY);
                    btn4.setTextColor(Color.DKGRAY);
                    btn5.setTextColor(Color.DKGRAY);
                    btn6.setTextColor(Color.DKGRAY);
                    btn7.setTextColor(Color.DKGRAY);
                    btn8.setTextColor(Color.DKGRAY);
                    btn9.setTextColor(Color.DKGRAY);
                    btnsuma.setTextColor(Color.DKGRAY);
                    btnresta.setTextColor(Color.DKGRAY);
                    btnmultiplicacion.setTextColor(Color.DKGRAY);
                    btndivision.setTextColor(Color.DKGRAY);
                    btnc.setTextColor(Color.DKGRAY);
                    btncoma.setTextColor(Color.DKGRAY);
                    btndel.setTextColor(Color.DKGRAY);
                    btnigual.setTextColor(Color.DKGRAY);
                    tv.setTextColor(Color.WHITE);
                }
                else{
                    sw.setText("off");
                    sw.setBackgroundColor(Color.WHITE);
                    cl.setBackgroundColor(Color.WHITE);
                    btn0.setBackgroundColor(Color.BLUE);
                    btn1.setBackgroundColor(Color.BLUE);
                    btn2.setBackgroundColor(Color.BLUE);
                    btn3.setBackgroundColor(Color.BLUE);
                    btn4.setBackgroundColor(Color.BLUE);
                    btn5.setBackgroundColor(Color.BLUE);
                    btn6.setBackgroundColor(Color.BLUE);
                    btn7.setBackgroundColor(Color.BLUE);
                    btn8.setBackgroundColor(Color.BLUE);
                    btn9.setBackgroundColor(Color.BLUE);
                    btnsuma.setBackgroundColor(Color.BLUE);
                    btnresta.setBackgroundColor(Color.BLUE);
                    btnmultiplicacion.setBackgroundColor(Color.BLUE);
                    btndivision.setBackgroundColor(Color.BLUE);
                    btnigual.setBackgroundColor(Color.BLUE);
                    btncoma.setBackgroundColor(Color.BLUE);
                    btndel.setBackgroundColor(Color.BLUE);
                    btnc.setBackgroundColor(Color.BLUE);
                    btn0.setTextColor(Color.WHITE);
                    btn1.setTextColor(Color.WHITE);
                    btn2.setTextColor(Color.WHITE);
                    btn3.setTextColor(Color.WHITE);
                    btn4.setTextColor(Color.WHITE);
                    btn5.setTextColor(Color.WHITE);
                    btn6.setTextColor(Color.WHITE);
                    btn7.setTextColor(Color.WHITE);
                    btn8.setTextColor(Color.WHITE);
                    btn9.setTextColor(Color.WHITE);
                    btnsuma.setTextColor(Color.WHITE);
                    btnresta.setTextColor(Color.WHITE);
                    btnmultiplicacion.setTextColor(Color.WHITE);
                    btndivision.setTextColor(Color.WHITE);
                    btnc.setTextColor(Color.WHITE);
                    btncoma.setTextColor(Color.WHITE);
                    btndel.setTextColor(Color.WHITE);
                    btnigual.setTextColor(Color.WHITE);
                    tv.setTextColor(Color.DKGRAY);
                }
            }
        });
    }

    public Double MetodoCalcularResultado(double op1, double op2, String operador) {
        Double resultado = 0.0;
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