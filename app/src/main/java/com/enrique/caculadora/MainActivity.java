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
                tv.setText(String.valueOf(MetodoCalcularResultado(Integer.parseInt(op1),Integer.parseInt(op2),operador)));
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

    public int MetodoCalcularResultado(int op1, int op2, String operador) {
        int resultado = 0;
        op1 = Integer.parseInt(tv.getText().toString());
        op2 = Integer.parseInt(tv.getText().toString());

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