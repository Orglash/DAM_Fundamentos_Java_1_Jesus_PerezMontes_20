package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaracion de variables
        int numero;
        int unidades;
        int decenas;
        String unidadesLetra="";
        String decenasLetra="";

        //Pedimos el número por consola
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entre 0 y 99: \n");
        numero=sc.nextInt();

        //Separamos el número en decenas y unidades
        unidades=numero%10;
        decenas=numero/10;

        //Switch para pasar la cifra a letra
        switch(decenas){
            case 0:
                decenasLetra="";
                break;
            case 1:
                decenasLetra="diez";
                break;
            case 2:
                decenasLetra="veinte";
                break;
            case 3:
                decenasLetra="treinta";
                break;
            case 4:
                decenasLetra="cuarenta";
                break;
            case 5:
                decenasLetra="cincuenta";
                break;
            case 6:
                decenasLetra="sesenta";
                break;
            case 7:
                decenasLetra="setenta";
                break;
            case 8:
                decenasLetra="ochenta";
                break;
            case 9:
                decenasLetra="noventa";
                break;
        }
        switch(unidades){
            case 0:
                unidadesLetra=" ";
                break;
            case 1:
                unidadesLetra="uno";
                break;
            case 2:
                unidadesLetra="dos";
                break;
            case 3:
                unidadesLetra="tres";
                break;
            case 4:
                unidadesLetra="cuatro";
                break;
            case 5:
                unidadesLetra="cinco";
                break;
            case 6:
                unidadesLetra="seis";
                break;
            case 7:
                unidadesLetra="siete";
                break;
            case 8:
                unidadesLetra="ocho";
                break;
            case 9:
                unidadesLetra="nueve";
                break;
        }
        //Imprimimos el resultado en pantalla.
        System.out.printf("El número introducido es %s y %s\n", decenasLetra, unidadesLetra);
    }
}
