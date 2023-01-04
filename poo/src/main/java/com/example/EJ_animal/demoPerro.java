package com.example.EJ_animal;

import java.util.Scanner;

class DemoPerro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Raza del animal:");
        String inputRaza = input.next();
        System.out.println("Tamaño del animal:");
        String inputTamaño = input.next();
        System.out.println("Domestico:");
        boolean inputDomestico = input.nextBoolean();

        System.out.println("altura a ingresar:");
        int inputAltura = input.nextInt();
        System.out.println("Peso en KG.:");
        int inputPeso = input.nextInt();
        System.out.println("ingresar años:");
        int inputAños = input.nextInt();
        System.out.println("Vivo:");
        boolean inputVivo = input.nextBoolean();

        perro a = new perro(inputRaza,inputTamaño,inputDomestico,inputAltura,inputPeso,inputAños,inputVivo);
        System.out.println(a.Edad(true));
        System.out.println(a.ladra());
        System.out.println(a.toString());
        a.Alimentacion();
        input.close();
    }
}