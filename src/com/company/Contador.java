package com.company;

public class Contador {
    private int valor;

    public Contador(int valor){
        this.valor = valor;
    }

    public Contador(Contador c){
        valor = c.getValor();
    }

    public void incrementar(){
        this.valor++;
    }

    public void decrementar(){
        this.valor--;
    }

    public Contador(){

    }

    public  int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}