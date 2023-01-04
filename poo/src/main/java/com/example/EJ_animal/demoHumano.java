package com.example.EJ_animal;
import java.util.Scanner;

public class demoHumano {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Color de ojos: ");
        String inputColorOjos = input.next();
        System.out.println("Nacionalidad: ");
        String inputNacionalidad = input.next();
        System.out.println("Mayor de edad: ");
        boolean inputMayoEdad = input.nextBoolean();
        System.out.println("Ingresar altura: ");
        int inputAltura = input.nextInt();
        System.out.println("Ingresar peso: ");
        int inputpeso = input.nextInt();
        System.out.println("Ingresar años: ");
        int inputAños = input.nextInt();
        System.out.println("Vivo: ");
        boolean inputVivo = input.nextBoolean();
        Humano a = new Humano(inputColorOjos, inputNacionalidad,inputMayoEdad, inputAltura, inputpeso, inputAños,inputVivo);
        a.Candidato();
        a.Alimentacion();
        input.close();
    }
}
