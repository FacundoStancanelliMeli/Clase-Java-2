package com.company;

import java.util.Date;

public class Fecha {
    private Date date = new Date();
    private final int dia;
    private final int mes;
    private final int anio;

    public Fecha(int dia, int mes, int anio){
        this.date.setYear(anio-1900);
        this.date.setMonth(mes-1);
        this.date.setDate(dia);
        this.dia = dia;
        this.mes = mes-1;
        this.anio = anio;
    }

    private static boolean casoDias(int dia, int cantDias){
        return dia >= 1 && dia <= cantDias;
    }

    private static boolean casoMeses(int mes){
        return mes >= 0 && mes <= 11;
    }


    public boolean fechaCorrecta(){
        boolean condicion;
        if (casoDias(this.dia, 31)){
            if (casoMeses(this.mes)){
                switch(this.mes){
                    case 3:
                    case 5:
                    case 8:
                    case 10:
                        condicion = casoDias(this.dia, 30);
                        break;

                    case 1:
                        condicion = casoDias(this.dia, 28);
                        break;
                    default:
                        condicion = true;
                }
            }
            else{
                condicion = false;
            }
        }
        else{
            condicion = false;
        }

        return condicion;
    }

    public void sumarDia(){
        Date dateAux = new Date();

        dateAux.setDate(this.date.getDate()+1);

        this.date = dateAux;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + this.dia +
                ", mes=" + (this.mes+1) +
                ", anio=" + (this.anio) +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

}
