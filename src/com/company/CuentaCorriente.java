package com.company;

public class CuentaCorriente {
    private double sueldo;
    private int numeroCuenta;

    public CuentaCorriente(double sueldo, int numeroCuenta){
        this.sueldo = sueldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.sueldo = cuentaCorriente.getSueldo();
        this.numeroCuenta = cuentaCorriente.getNumeroCuenta();
    }

    public void ingreso(){

    }

    public void reintegro(){

    }

    public void egreso(){

    }

    public void transferencia(){

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
