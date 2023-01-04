package com.example.EJ_Colectivo;

import java.util.Scanner;

class DemoLargaDistancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Empresa a ingresar:");
        String inputEmpresa = input.next();
        System.out.println("Internacional:");
        Boolean inputInternacional = input.nextBoolean();
        System.out.println("Asientos:");
        String inputAsientos = input.next();
        System.out.println("Kilometros:");
        int inputKMS = input.nextInt();
        System.out.println("Pasajeros a ingresar:");
        int inputPasajeros = input.nextInt();
        System.out.println("Capacidad Maxima de pasajeros:");
        int inputMaxPjros = input.nextInt();
        System.out.println("Antiguedad del Colectivo:");
        int inputAntiguedad = input.nextInt();
        LargaDistancia B = new LargaDistancia(inputEmpresa,inputInternacional,inputAsientos,inputKMS,inputPasajeros,inputMaxPjros,inputAntiguedad);
        B.fueraDeServcio();
        B.valorPasaje();
        B.patente();
        input.close();
    }
}