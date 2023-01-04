package com.example.EJ_Legislador;

public abstract class Legislador {
    protected String Nombre;
    protected String Apellido;
    protected int Edad;
    protected String Provincia;

    public Legislador(){
        this.Nombre = "Roberto";
        this.Apellido = "Moritan";
        this.Edad = 47;
        this.Provincia = "Ciudad de Buenos Aires";
    }

    public Legislador(String newNombre, String newApellido, int newEdad, String newProvincia){
        this.Nombre = newNombre;
        this.Apellido = newApellido;
        this.Edad = newEdad;
        this.Provincia = newProvincia;
    }
    
    public abstract void Asistencia(int Num);

    public abstract void AsistenciaPartido(String PartidoPolitico, int cantidad);

    public void AsistenciaProv(int CantLegislador){
        System.out.println("Legisladores: " + CantLegislador + ", Provincia: " + this.Provincia);
    }    
}
