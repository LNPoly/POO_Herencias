package com.example.EJ_Colectivo;

class Urbano extends Colectivo implements CajaCambio{
    private int NroLinea;
    private int DistRecorrido;
    private int Interno;

    public Urbano(){
        super();
        this.NroLinea = 168;
        this.DistRecorrido = 20;
        this.Interno = 1005;
    }
    public Urbano(int newNroLinea,
        int newDistRecorrido,
        int newInterno,
        int newPasajeros,
        int newMaxPjros,
        int newAntiguedad){
        super(newPasajeros, newMaxPjros, newAntiguedad);
        this.NroLinea = newNroLinea;
        this.DistRecorrido = newDistRecorrido;
        this.Interno = newInterno;
    }
    @Override
    public void patente() {
        System.out.println("DTE 258");
    }
    @Override
    public int cambiarMarchas(int IngrMarchas){
        if (IngrMarchas > CAMBIOS){
            return 5;
        }
        return 0;
    }
    public void BoletoMax(){
        if(DistRecorrido >= 60){
            System.out.println(120);
        }
        if(DistRecorrido >= 30 && DistRecorrido < 60){
            System.out.println(70);
        }
        if(DistRecorrido >= 15 && DistRecorrido < 30){
            System.out.println(28);
        }
        if(DistRecorrido < 15){
            System.out.println(25);
        }
    }
public String toString(){
    return "Linea: " + this.NroLinea +
        ", Distancia del recorrido: " +
        this.DistRecorrido + ", Interno: " +
        this.Interno + ", Pasajeros: " + this.Pasajeros +
        ", Capacidad Max: " + this.maxPasajeros +
        ", Antiguedad: " + this.antiguedad;
    }
}
