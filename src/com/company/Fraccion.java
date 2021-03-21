package com.company;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion (int n, int d){
        this.numerador = n;
        this.denominador = d;
    }

    private static double operaciones (String operacion, Fraccion fraccion1, Fraccion fraccion2){
        double nResultado = 0;
        double dResultado = 0;
        double resultadoADevolver;

        switch (operacion){
            case "+":
                nResultado = fraccion1.getNumerador()* fraccion2.getDenominador()  + fraccion2.getNumerador()* fraccion1.getDenominador();
                dResultado = fraccion1.getDenominador() * fraccion2.getDenominador() ;
            break;
            case "-":
                nResultado = fraccion1.getNumerador()* fraccion1.getDenominador()  - fraccion2.getNumerador()* fraccion1.getDenominador() ;
                dResultado = fraccion1.getDenominador()  * fraccion2.getDenominador() ;
                break;
            case "*":
                nResultado = fraccion1.getNumerador()* fraccion2.getNumerador();
                dResultado = fraccion2.getDenominador()  * fraccion2.getDenominador() ;
                break;
            case "/":
                nResultado = fraccion1.getNumerador()* fraccion2.getDenominador() ;
                dResultado = fraccion1.getDenominador()  * fraccion2.getNumerador();
                break;

        }

        resultadoADevolver = nResultado/dResultado;

        return resultadoADevolver;
    }

    private static double operaciones (String operacion, Fraccion fraccion1, double numeroEntero){
        double nResultado = 0;
        double dResultado = 0;
        double resultadoADevolver;

        switch (operacion){
            case "+":
                nResultado = fraccion1.getNumerador() + numeroEntero* fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador();
                break;
            case "-":
                nResultado = fraccion1.getNumerador() - numeroEntero* fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador();
                break;
            case "*":
                nResultado = fraccion1.getNumerador()*numeroEntero;
                dResultado = fraccion1.getDenominador();
                break;
            case "/":
                nResultado = fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador()  * numeroEntero;
                break;

        }

        resultadoADevolver = nResultado/dResultado;

        return resultadoADevolver;
    }

    private static double operaciones (String operacion, double numeroEntero, Fraccion fraccion1){
        double nResultado = 0;
        double dResultado = 0;
        double resultadoADevolver;

        switch (operacion){
            case "+":
                nResultado = fraccion1.getNumerador() + numeroEntero* fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador();
                break;
            case "-":
                nResultado = fraccion1.getNumerador() - numeroEntero* fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador();
                break;
            case "*":
                nResultado = fraccion1.getNumerador()*numeroEntero;
                dResultado = fraccion1.getDenominador();
                break;
            case "/":
                nResultado = fraccion1.getNumerador();
                dResultado = fraccion1.getDenominador()  * numeroEntero;
                break;

        }

        resultadoADevolver = nResultado/dResultado;

        return resultadoADevolver;
    }

    public static double sumar (Fraccion fraccion1, Fraccion fraccion2){
        return operaciones("+", fraccion1, fraccion2);
    }
    public static double restar (Fraccion fraccion1, Fraccion fraccion2){
        return operaciones("-", fraccion1, fraccion2);
    }
    public static double multiplicar (Fraccion fraccion1, Fraccion fraccion2) {
        return operaciones("*", fraccion1, fraccion2);
    }

    public static double dividr (Fraccion fraccion1, Fraccion fraccion2) {
        return operaciones("/", fraccion1, fraccion2);
    }

    public static double sumar (Fraccion fraccion1, double numero){
        return operaciones("+", fraccion1, numero);
    }
    public static double restar (Fraccion fraccion1, double numero){
        return operaciones("-", fraccion1, numero);
    }
    public static double multiplicar (Fraccion fraccion1, double numero) {
        return operaciones("*", fraccion1, numero);
    }

    public static double dividr (Fraccion fraccion1, double numero) {
        return operaciones("/", fraccion1, numero);
    }

    public static double sumar (double numero, Fraccion fraccion1){
        return operaciones("+", numero, fraccion1);
    }
    public static double restar (double numero ,Fraccion fraccion1){
        return operaciones("-", numero, fraccion1);
    }
    public static double multiplicar (double numero, Fraccion fraccion1) {
        return operaciones("*", numero, fraccion1);
    }

    public static double dividr (double numero, Fraccion fraccion1) {
        return operaciones("/", numero, fraccion1);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

}