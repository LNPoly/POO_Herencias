package com.example.EJ_Legislador;

public class Diputados extends Legislador implements Votacion{
    private String PartidoPolitico;
    private String Voto;
    private int Diputado;

    public Diputados(){
        super();
        this.PartidoPolitico = "Juntos por el Cambio";
        this.Voto = "Positivo";
    }

    public Diputados(String newPartidoPolitico, String newVoto,String newNombre, String newApellido, int newEdad, String newProvincia){
        super(newNombre, newApellido, newEdad, newProvincia);
        this.PartidoPolitico = newPartidoPolitico;
        this.Voto = newVoto;
    }
    
    @Override
    public void Asistencia(int Num) {
        this.Diputado = Num;
     System.out.println("Diputado N°: " + Diputado);
    }

    @Override
    public void AsistenciaPartido(String PartidoPolitico, int cantidad) {
        if (PartidoPolitico == "Juntos por el Cambio"){
            cantidad += 1;
            System.out.println("Asistencias diputados: " + cantidad + ", " + PartidoPolitico);
        }
        else{
            cantidad += 1;
            System.out.println("Asistencias diputados: " + cantidad + ", " + PartidoPolitico);
        }
    }

    @Override
    public void elegir(int Numero) {
        if (Numero == 1){
            System.out.println("Positivo");
        }
        if (Numero == 2){
            System.out.println("Negativo");
        }
        if (Numero == 3){
            System.out.println("Abstiene");
        }
        return;   
        }
    public void Votar(){
        System.out.println(Voto + ", " + Nombre + " " + Apellido + ", " + PartidoPolitico);
    }
    
    public int getDiputado() {
        return Diputado;
    }
    public String getVoto() {
        return Voto;
    }
    public String getPartidoPolitico() {
        return PartidoPolitico;
    }
       
}
/* 
class DemoDiputados{
    public static void main(String[] args) {

        Diputados A1 = new Diputados();
        A1.Asistencia(10);
        A1.AsistenciaPartido("Juntos por el Cambio, ", 5);
        A1.elegir(2);
        A1.Votar();

        
    }
}
*/