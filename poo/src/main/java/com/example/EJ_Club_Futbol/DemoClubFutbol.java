package com.example.EJ_Club_Futbol;

import java.util.Scanner;

class DemoClubFutbol{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ubicacion:");
        String inputUbicacion = input.next();
        System.out.println("Nombre del club: ");
        String inputNombreClub = input.next();
        System.out.println("Estadio: ");
        String inputNombreEstadio = input.next();
        System.out.println("Fecha de fundacion del equipo: ");
        String inputFechaFundacion = input.next();
        System.out.println("colores: ");
        String inputcolores = input.next();
        ClubFutbol A = new ClubFutbol(inputUbicacion,inputNombreClub,inputNombreEstadio,inputFechaFundacion,inputcolores);
        A.CamisetaAlternativa("Amarillo y verde");
        System.out.println(A.CapacidadEstadio(26000));
        System.out.println("jugadores habilitados para jugar el prox partido: " + A.autorizados(7));
        input.close();
        }
}
