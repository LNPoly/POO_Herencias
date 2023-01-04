package com.example.EJ_animal;

public abstract class animal{
    protected int Altura;
    protected int Peso;
    protected int Años;
    protected boolean Vivo;

    public animal(){
        this.Altura = 150;
        this.Peso = 60;
        this.Años = 20;
        this.Vivo = true;
    }
    public animal (int newAltura, int newPeso, int newAños, Boolean newVivo){
        this.Altura = newAltura;
        this.Peso = newPeso;
        this.Años = newAños;
        this.Vivo = newVivo;
    }
    public abstract void Alimentacion();

    public void Respirar(boolean Vivo){
     this.Vivo = false;
    }
    public String toString() {
        return "Altura: "+ this.Altura + ", Peso: " + this.Peso + ", Años: " + this.Años + ", Vivo: "+ this.Vivo;
    }
    public void Vivo() {
        System.out.println(toString());
    }

}