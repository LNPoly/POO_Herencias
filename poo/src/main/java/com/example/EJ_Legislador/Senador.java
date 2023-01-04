package com.example.EJ_Legislador;

public class Senador extends Legislador implements Votacion {
    private String PartidoPolitico;
    private Boolean Presidente;
    private boolean Ausente;

    public Senador(){
        super();
        this.PartidoPolitico = "Frente de Todos";
        this.Presidente = false;
        this.Ausente = false;

    }
    public Senador(String newPartidoPolitico,Boolean newPresidente, boolean newAusente,String newNombre, String newApellido, int newEdad, String newProvincia){
        super(newNombre, newApellido, newEdad, newProvincia);
        this.PartidoPolitico = newPartidoPolitico;
        this.Presidente = newPresidente;
        this.Ausente = newAusente;
    }
   
    @Override
    public void Asistencia(int Num) {
        if (Ausente == false){
            int Senadores = Num+1;
            System.out.println("Senador N°: " + Senadores);
        }
    }

    @Override
    public void AsistenciaPartido(String PartidoPolitico, int cantidad) {
       if (Ausente == false){
        int Senadores = cantidad+1;
        System.out.println("Asistencias senadores: " + Senadores + ", " + PartidoPolitico);
        }
    }
    @Override
    public void elegir(int Num) {
        if (Ausente == true && Presidente == true){
            System.out.println(" ");
        }
        if (Ausente == false && Presidente == false && Num == 1){
            System.out.println("Positivo");
        }
        if (Ausente == false && Presidente == false && Num == 2){
            System.out.println("Negativo");
        }
        if (Ausente == false && Presidente == false && Num == 3){
            System.out.println("Abstiene");
        }
        return;   
        }

    public void Presente(boolean Ausente){
        if (Ausente == false){
            System.out.println(Nombre + " " + Apellido + ", " + PartidoPolitico);
        }
        else{
            System.out.println("Ausente.");
        }
    }
    public String getVoto() {
        String Voto = "Positivo";
        if(Voto == "Positivo" && Ausente == false){
            return Voto;
        }
        else{
            return "Negativo";
        }
    }
}