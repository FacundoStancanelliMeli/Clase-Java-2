package com.company;

import java.util.ArrayList;

public class StringUtil2 {
    private static boolean caracterEspacio(char c) {
        return c == ' ';
    }

    public static String itrim(String s) {
        StringBuilder build = new StringBuilder(s);
        int i = 0;
        String cadenaADevolver;

        while (caracterEspacio(s.charAt(i))) {
            build.deleteCharAt(i);
            i++;
        }

        cadenaADevolver = build.toString();

        return cadenaADevolver;
    }

    private static int devolverUltimoCaracterDistintoAEspacio(String s) {
        int i = 0;
        while (!caracterEspacio(s.charAt(i))) {
            i++;
        }

        return i;
    }

    private static String devolverCadenaSinEspaciosALaDerecha(String s, int longitud, int indiceComienzo) {
        StringBuilder build = new StringBuilder(s);

        for (int i = indiceComienzo; i < longitud; i++) {
            build.deleteCharAt(i);
        }

        return build.toString();
    }

    public static String rtrim(String s) {
        int indiceUltimoCaracterDistintoAEspacio;
        int longitudString;
        String cadenaADevolver;

        indiceUltimoCaracterDistintoAEspacio = devolverUltimoCaracterDistintoAEspacio(s);
        longitudString = s.length();

        cadenaADevolver = devolverCadenaSinEspaciosALaDerecha(s, longitudString, indiceUltimoCaracterDistintoAEspacio);

        return cadenaADevolver;
    }

    public static String trim(String s) {
        String cadenaADevolver;

        cadenaADevolver = itrim(s);
        cadenaADevolver = rtrim(cadenaADevolver);

        return cadenaADevolver;
    }

    private static ArrayList<Integer> devolverIndices(String s, char c) {
        ArrayList<Integer> listaIndices = new ArrayList<Integer>();
        int indice = s.indexOf(c);

        while (indice >= 0) {
            listaIndices.add(indice);
            indice = s.indexOf(c, indice + 1);
        }

        return listaIndices;
    }

    private static boolean comprobarRtaNoFueMenos1(ArrayList<Integer> lista, int n) {
        return lista.size() != 0 && lista.size() >= n;
    }

    public static int indexOfN(String s, char c, int n) {
        ArrayList<Integer> listaIndices = new ArrayList<Integer>();

        listaIndices = devolverIndices(s, c);

        int indiceADevolver = -1;

        if (comprobarRtaNoFueMenos1(listaIndices, n)) {
            indiceADevolver = listaIndices.get(n - 1) + 1;
        }


        return indiceADevolver;
    }
}