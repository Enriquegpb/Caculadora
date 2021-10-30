package com.enrique.caculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.button10);
        btn2=(Button) findViewById(R.id.button11);
        btn3=(Button) findViewById(R.id.button12);
        btn4=(Button) findViewById(R.id.button7);
        btn5=(Button) findViewById(R.id.button8);
        btn6=(Button) findViewById(R.id.button9);
        btn7=(Button) findViewById(R.id.button4);
        btn8=(Button) findViewById(R.id.button5);
        btn9=(Button) findViewById(R.id.button6);
        tv=(TextView) findViewById(R.id.textView);
    }

    public void MetodoCalcularResultado(View view) {
        int op1, op2, resultado=0;
        String operador=null;
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
        tvcalc.setText(resultado);
    }
}