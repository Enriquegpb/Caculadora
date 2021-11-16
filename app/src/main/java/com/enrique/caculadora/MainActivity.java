package com.enrique.caculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnigual,btnsuma,btnresta,btnmultiplicacion,btndivision,btnc,btndel,btncoma;
    TextView tv;
    String operador,op1="",op2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (ImageButton) findViewById(R.id.cero);
        btn1 = (ImageButton) findViewById(R.id.uno);
        btn2 = (ImageButton) findViewById(R.id.dos);
        btn3 = (ImageButton) findViewById(R.id.tres);
        btn4 = (ImageButton) findViewById(R.id.cuatro);
        btn5 = (ImageButton) findViewById(R.id.cinco);
        btn6 = (ImageButton) findViewById(R.id.seis);
        btn7 = (ImageButton) findViewById(R.id.siete);
        btn8 = (ImageButton) findViewById(R.id.ocho);
        btn9 = (ImageButton) findViewById(R.id.nueve);
        btnsuma = (ImageButton) findViewById(R.id.suma);
        btnresta = (ImageButton) findViewById(R.id.resta);
        btnmultiplicacion = (ImageButton) findViewById(R.id.product);
        btndivision = (ImageButton) findViewById(R.id.div);
        btnc=(ImageButton) findViewById(R.id.calc_C);
        btndel=(ImageButton) findViewById(R.id.DEL);
        btncoma=(ImageButton) findViewById(R.id.punto);
        btnigual = (ImageButton) findViewById(R.id.igual);
        tv = (TextView) findViewById(R.id.textView);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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