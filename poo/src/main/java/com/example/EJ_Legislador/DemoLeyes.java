package com.example.EJ_Legislador;

import java.util.ArrayList;

public class DemoLeyes {
    private static int ContarVotosDiputados;
    private static int ContarVotosSenador;
    public static void main(String[] args) {
        ArrayList<Diputados> Diputado = new ArrayList<Diputados>();
        ArrayList<Senador> Senadores = new ArrayList<Senador>();
        /*DIPUTADOS FRENTE DE TODOS */
        System.out.println("----------------DIPUTADOS FRENTE DE TODOS---------------");
        Diputados A1 = new Diputados("Frente de Todos","Negativo","Lola", "Morales",35,"Formosa");
        Diputado.add(A1);
        A1.Asistencia(1);
        A1.Votar();
        Diputados A2 = new Diputados("Frente de Todos","Abstiene","Mario", "Gomez",45,"Formosa");
        Diputado.add(A2);
        A2.Asistencia(2);
        A2.Votar();
        Diputados A3 = new Diputados("Frente de Todos","Positivo","Claudia", "Soto",40,"Jujuy");
        Diputado.add(A3);
        A3.Asistencia(3);
        A3.Votar();
        Diputados A4 = new Diputados("Frente de Todos","Positivo","Roberto", "Rodriguez",43,"Chaco");
        Diputado.add(A4);
        A4.Asistencia(4);
        A4.Votar();
        /*DIPUTADOS JUNTOS POR EL CAMBIO */
        System.out.println("----------------DIPUTADOS JUNTO POR EL CAMBIO---------------");
        Diputados A5 = new Diputados("Juntos por el Cambio","Positivo","Lorena", "Suarez",38,"Ciudad de Buenos Aires");
        Diputado.add(A5);
        A5.Asistencia(1);
        A5.Votar();
        Diputados A6 = new Diputados("Juntos por el Cambio","Positivo","Cristina", "Fussaro",47,"Cordoba");
        Diputado.add(A6);
        A6.Asistencia(2);
        A6.Votar();
        Diputados A7 = new Diputados("Juntos por el Cambio","Abstiene","Pablo", "Lopez",39,"Ciudad de Buenos Aires");
        Diputado.add(A7);
        A7.Asistencia(3);
        A7.Votar();
        /*SENADORES FRENTE DE TODOS */
        System.out.println("----------------SENADORES FRENTE DE TODOS---------------");
        Senador B1 = new Senador("Frente de Todos",false,  false,"Laura", "Adonis", 36, "Neuquen");
        Senadores.add(B1);
        B1.Asistencia(1);
        B1.elegir(1);
        B1.Presente(false);
        Senador B2 = new Senador("Frente de Todos",false,  false,"Lorenzo", "Funes", 48, "Catamarca");
        Senadores.add(B2);
        B2.Asistencia(2);
        B2.elegir(1);
        B2.Presente(false);
        Senador B3 = new Senador("Frente de Todos",false,  false,"Sandra", "Montalvan", 47, "Rio Negro");
        Senadores.add(B3);
        B3.Asistencia(3);
        B3.elegir(2);
        B3.Presente(false);
        /*SENADORES JUNTOS POR EL CAMBIO */
        System.out.println("----------------SENADORES JUNTOS POR EL CAMBIO---------------");
        Senador B4 = new Senador("Juntos por el Cambio",false,  false,"Sandra", "Fernandez", 42, "La Pampa");
        Senadores.add(B4);
        B4.Asistencia(0);
        B4.elegir(1);
        B4.Presente(false);
        Senador B5= new Senador("Juntos por el Cambio",false,  false,"Mirtha", "Ortiz", 44, "Provincia de Buenos Aires");
        Senadores.add(B5);
        B5.Asistencia(1);
        B5.elegir(1);
        B5.Presente(false);
        System.out.println("--------------------PARTIDO OBRERO-------------------");
        Senador C1 = new Senador("Partido Obrero",false,  true,"Nicolas", "Fernandez", 42, "Cordoba");
        Senadores.add(C1);
        C1.Asistencia(1);
        C1.Presente(true);
        System.out.println("--------------------SENADOR PRESIDENTE-------------------");
        Senador C2 = new Senador("Frente de Todos",true,  false,"Lucas", "Ortigoza", 42, "Provincia de Buenos Aires");
        Senadores.add(C2);
        C2.Asistencia(0);
        C2.Presente(false);
        System.out.println("--------------------==================-------------------");
        /*CONTADOR DE VOTOS */
        for (int i = 1; i < Diputado.size(); i++){
            if (Diputado.get(i).getVoto() == "Positivo"){
                ContarVotosDiputados +=1;
            }
            else if (Diputado.get(i).getVoto() == "Negativo"){
                ContarVotosDiputados-=1;
            }     
        }
        System.out.println("votos positivos de Diputados: " + ContarVotosDiputados);
        if(ContarVotosDiputados > 0){
            System.out.println("Ley Aprobada");
        }
        else{
            System.out.println("Ley Derogada");
        }
        for(int i = 0 ; i < Senadores.size(); i++){
            if (Senadores.get(i).getVoto()== "Positivo"){
                ContarVotosSenador +=1;
            }
            else if (Senadores.get(i).getVoto()== "Negativo") {
                ContarVotosSenador-=1;
            }
        }
        System.out.println("votos positivos de Senadores: " + ContarVotosSenador);
        if(ContarVotosSenador > 0){
            System.out.println("Ley Aprobada");
        }
        else{
            System.out.println("Ley Derogada");
        }    
    }
}
      