package com.example.EJ_animal;

class vaca extends animal {
    private String Raza;
    private Boolean Lechera;
    private Boolean Ganado;

    public vaca (){
        super();
        this.Raza = "Angus";
        this.Lechera = true;
        this.Ganado = true;
    }
    public vaca(String newRaza,
        boolean newLechera,
        boolean newGanado,
        int newAltura,
        int newPeso,
        int newAños,
        boolean newVivo){
            super(newAltura, newPeso, newAños, newVivo);
            this.Raza = newRaza;
            this.Lechera = newLechera;
            this.Ganado = newGanado;
    }
    @Override
    public void Alimentacion(){
        System.out.println("Herbivoro");
    }

    public String Ordeñar(boolean Lechera, boolean Ganado, String Nacionalidad){
        if (Lechera == true && Ganado == true && Nacionalidad == "Argentino"){
            
            return "Ordeñar 10 Lts de leche.";
        }
        else {
            return "No se puede ordeñar.";
        }
    }
    public String toString(){
        return "Raza: " + this.Raza + ", Lechera: " + this.Lechera + ", Ganado: " + this.Ganado + ", Altura: "+ this.Altura + ", Peso: " + this.Peso + ", Años: " + this.Años + ", Vivo: "+ this.Vivo;
    }
}
class DemoVaca{
    public static void main(String[] args){
        vaca b = new vaca("Shorthorn", false, true, 140, 700, 10, true);
        System.out.println(b.toString());
        System.out.println(b.Ordeñar(false, true, "Uruguaya"));

        Humano a = new Humano("Marrones","Argentino",true, 165, 60,35, true );
        System.out.println(b.Ordeñar(true, true,a.getNacionalidad()));
        System.out.println(a.getNacionalidad());

        Humano c = new Humano();
        System.out.println(b.Ordeñar(false, true,c.getNacionalidad()));
        System.out.println(c.getNacionalidad());    
    }
}
