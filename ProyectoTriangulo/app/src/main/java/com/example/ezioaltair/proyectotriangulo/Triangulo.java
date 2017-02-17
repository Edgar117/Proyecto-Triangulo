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

    private EditText editTextA, editTextB, editTextC; //Variables donde se guardaran los datos ingresos
    private Button btnOperacion; //Boton que servirá para que al presionar pueda hace el calculo
    private TextView textView; //Para mostrar el resultad
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

       /* ImageView logo = (ImageView)findViewById(R.id.iv1);
        logo.setImageResource(R.drawable.triangulo);*/

        editTextA = (EditText) findViewById(R.id.editTextA); //Pasar los datos ingresados en los text a las variables creadas
        editTextB = (EditText) findViewById(R.id.editTextB);  //Pasar los datos ingresados en los text a las variables creadas
        editTextC = (EditText) findViewById(R.id.editTextC); //Pasar los datos ingresados en los text a las variables creadas
        btnOperacion = (Button) findViewById(R.id.btnOperacion); //Instancia del boton creado
        textView = (TextView) findViewById(R.id.textViewR); //Instancia del textView creado

        btnOperacion.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        // se obtienen las variables y se convierten a tipo double para hacer las operaciones
        double a = Double.parseDouble(editTextA.getText().toString());
        double b = Double.parseDouble(editTextB.getText().toString());
        double c = Double.parseDouble(editTextC.getText().toString());

        //operación para hacer el calculo del área
        double suma = a+b+c;
        double Divisor=suma/2;

        //variables para la verificacion de si es triángulo
        double Opercion1=Divisor-a;
        double Operacion2=Divisor-b;
        double Operacion3=Divisor-c;


// Validación para verificar si es un triángulo

        if (Opercion1 + Operacion2 > Operacion3){ // compara el lado  A y B para verificar si son mayores que C
            if (Operacion2 + Operacion3 > Opercion1){ // compara si el lado B y C son mayores que el A
                if (Opercion1 + Operacion3 > Operacion2){ // compara si el lado A y C son mayores que el B
                    double Multiplicacion = Divisor*Opercion1*Operacion2*Operacion3; // se hace la operacion indicada
                    double raiz=Math.sqrt(Multiplicacion); //se saca la raiz del producto obtenido de multiplicacion
                    textView.setText("Area = " + raiz); //se muestra la raíz del triángulo
                    Toast toast1 = Toast.makeText(getApplicationContext(), "SI, es un triángulo", Toast.LENGTH_SHORT);
                    toast1.show(); //muestra mensaje si es triángulo
                }
                else{
                    double Multiplicacion = Divisor*Opercion1*Operacion2*Operacion3; // se hace la operacion indicada
                    double raiz=Math.sqrt(Multiplicacion); //se saca la raiz del producto obtenido de multiplicacion
                    textView.setText("Area = " + raiz); //se muestra la raíz del triángulo
                    Toast toast1 = Toast.makeText(getApplicationContext(), "SI, es un triangulo", Toast.LENGTH_SHORT);
                    toast1.show(); //muestra mensaje si es triángulo
                }
            }
            else {
                Toast toast1 = Toast.makeText(getApplicationContext(), "NO, es un triangulo", Toast.LENGTH_SHORT);
                toast1.show(); //Muestra mensaje de que no es triangulo
            }
        }
        else {
            Toast toast1 = Toast.makeText(getApplicationContext(), "NO, es un triangulo", Toast.LENGTH_SHORT);
            toast1.show(); //Muestra mensaje de que no es triangulo
        }

        limpiar();
    }

    //Método para limpiar los text
    public void limpiar(){
        editTextA.setText(""); //limpia text A
        editTextB.setText(""); //limpia text B
        editTextC.setText(""); //limpia text C
    }

}

