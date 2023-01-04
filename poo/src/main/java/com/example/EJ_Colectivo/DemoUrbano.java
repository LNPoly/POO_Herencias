package com.example.EJ_Colectivo;

import java.util.Scanner;

class DemoUrbano{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar numero de linea: ");
        int inputlinea = input.nextInt();
        System.out.println("Recorrido: ");
        int inputDistRecorrido = input.nextInt();
        System.out.println("Interno N°: ");
        int inputInterno = input.nextInt();
        System.out.println("Pasajeros a ingresar:");
        int inputPasajeros = input.nextInt();
        System.out.println("Capacidad Maxima de pasajeros:");
        int inputMaxPjros = input.nextInt();
        System.out.println("Antiguedad del Colectivo:");
        int inputAntiguedad = input.nextInt();
        Urbano A = new Urbano(inputlinea,inputDistRecorrido,inputInterno,inputPasajeros,inputMaxPjros,inputAntiguedad);
        System.out.println(A.toString());
        A.BoletoMax();
        A.patente();
        System.out.println("marchas: " + A.cambiarMarchas(4));
        input.close();
        }

}
