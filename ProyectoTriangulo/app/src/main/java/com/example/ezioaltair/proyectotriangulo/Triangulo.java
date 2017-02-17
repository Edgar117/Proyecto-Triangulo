package com.example.ezioaltair.proyectotriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Triangulo extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextA, editTextB, editTextC;
    private Button btnOperacion;
    private TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

       /* ImageView logo = (ImageView)findViewById(R.id.iv1);
        logo.setImageResource(R.drawable.triangulo);*/

        editTextA = (EditText) findViewById(R.id.editTextA);
        editTextB = (EditText) findViewById(R.id.editTextB);
        editTextC = (EditText) findViewById(R.id.editTextC);
        btnOperacion = (Button) findViewById(R.id.btnOperacion);
        textView = (TextView) findViewById(R.id.textViewR);

        btnOperacion.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        double a = Double.parseDouble(editTextA.getText().toString());
        double b = Double.parseDouble(editTextB.getText().toString());
        double c = Double.parseDouble(editTextC.getText().toString());

        double suma = a+b+c;
        double Divisor=suma/2;

        double Opercion1=Divisor-a;
        double Operacion2=Divisor-b;
        double Operacion3=Divisor-c;


// Validación para verificar si es un triángulo

        if (Opercion1 + Operacion2 > Operacion3){
            if (Operacion2 + Operacion3 > Opercion1){
                if (Opercion1 + Operacion3 > Operacion2){
                    double Multiplicacion = Divisor*Opercion1*Operacion2*Operacion3;
                    double raiz=Math.sqrt(Multiplicacion);
                    textView.setText("Area = " + raiz);
                    Toast toast1 = Toast.makeText(getApplicationContext(), "SI, es un triangulo", Toast.LENGTH_SHORT);
                    toast1.show();
                }
                else{
                    double Multiplicacion = Divisor*Opercion1*Operacion2*Operacion3;
                    double raiz=Math.sqrt(Multiplicacion);
                    textView.setText("Area = " + raiz);
                    Toast toast1 = Toast.makeText(getApplicationContext(), "SI, es un triangulo", Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
            else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "NO, es un triangulo", Toast.LENGTH_SHORT);
                toast1.show();
            }
        }
        else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "NO, es un triangulo", Toast.LENGTH_SHORT);
            toast1.show();
        }

        limpiar();
    }
    public void limpiar(){
        editTextA.setText("");
        editTextB.setText("");
        editTextC.setText("");
    }

}

