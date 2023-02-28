package com.example.funmatematic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText var1, var2;
    TextView res;
    Button Suma,Resta,Mult,Divi;
    Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var1=(EditText) findViewById(R.id.valor1);
        var2=(EditText) findViewById(R.id.valor2);
        res=(TextView) findViewById(R.id.result);
        Suma=(Button) findViewById(R.id.calculo);
        Resta=(Button) findViewById(R.id.button);
        Mult=(Button) findViewById(R.id.button3);
        Divi=(Button) findViewById(R.id.button2);
        Salir=(Button) findViewById(R.id.salir);

        Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma();
            }
        });
        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resta();
            }
        });

        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicacion();
            }
        });

        Divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divi();
            }
        });



        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir();
            }
        });
    }

    private void divi(){
        double x, y;
        double r;

        x=Integer.parseInt(var1.getText().toString());
        y=Integer.parseInt(var2.getText().toString());
        r=x/y;
        res.setText(String.valueOf(r));
    }

    private void multiplicacion(){
        int x, y;
        int r;

        x=Integer.parseInt(var1.getText().toString());
        y=Integer.parseInt(var2.getText().toString());
        r=x*y;
        res.setText(String.valueOf(r));
    }

    private void resta(){
        int x, y;
        int r;

        x=Integer.parseInt(var1.getText().toString());
        y=Integer.parseInt(var2.getText().toString());
        r=x-y;
        res.setText(String.valueOf(r));
    }

    private void suma(){
        int x, y;
        int r;

        x=Integer.parseInt(var1.getText().toString());
        y=Integer.parseInt(var2.getText().toString());
        r=x+y;
        res.setText(String.valueOf(r));
    }

    private void salir(){
        finish();
    }
}