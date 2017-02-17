package com.example.ezioaltair.proyectotriangulo;

/**
 * Created by Ezio Altair on 16/02/2017.
 */
public class TestTriangulo extends Triangulo {

    double a;//Lados de los triangulos
    double b;//Lados de los triangulos
    double c;//Lados de los triangulos
    //Metodos set y get de los lados de los traingulos
    public double getA() {
        return a;
    } //estos métodos sirven para poder obtener el valor A

    public void setA(double a) {
        this.a = a;
    } //estos métodos sirven para poder enviar el valor A

    public double getB() {
        return b;
    }//estos métodos sirven para poder obtener el valor B

    public void setB(double b) {
        this.b = b;
    } //estos métodos sirven para poder enviar el valor B

    public double getC() {
        return c;
    }//estos métodos sirven para poder obtener el valor C

    public void setC(double c) {
        this.c = c;
    } //estos métodos sirven para poder enviar el valor B

    public TestTriangulo()
    {

    }

    //Método para calcular el area del triángulo y luego lo devuelve
    public double area() {
        double s = (a+b+c)/2;
        //return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return Math.sqrt(s*((s-a))*((s-b))*((s-c)));
    }
}
