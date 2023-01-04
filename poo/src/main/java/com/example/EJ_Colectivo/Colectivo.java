package com.example.EJ_Colectivo;

public abstract class Colectivo {
    protected int Pasajeros;
    protected int maxPasajeros;
    protected int antiguedad;

    public Colectivo(){
        this.Pasajeros = 15;
        this.antiguedad = 19;
        this.maxPasajeros = 25;
        }
    public Colectivo(int newPasajeros, int newMaxPjros, int newAntiguedad){
        this.Pasajeros = newPasajeros;
        this.antiguedad = newAntiguedad;
        this.maxPasajeros = newMaxPjros;
        }
    public void CargarPasajeros(int CantPasajeros){
        if (maxPasajeros <= 26 && antiguedad <= 20){
            this.Pasajeros += CantPasajeros;
            }
            System.out.println(this.Pasajeros);
        }
        
    public void fueraDeServcio(){
        if (antiguedad > 20){
            System.out.println("FUERA DE SERVICIO");
        }
    }
    public abstract void patente();
}