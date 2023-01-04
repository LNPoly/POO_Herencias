package com.example.EJ_animal;

class Humano extends animal{
    private String ColorOjos;
    private String Nacionalidad;
    private boolean MayorEdad;
    private String Candidato;

    public Humano(){
        super();
        this.ColorOjos = "marrones";
        this.Nacionalidad = "Ingles";
        this.MayorEdad = true;
    }
    public Humano(
            String newColorOjos, 
            String newNacionalidad,  
            boolean newMayoEdad,
            int newAltura,
            int newPeso,
            int newAños,
            boolean newVivo){
        super(newAltura, newPeso, newAños, newVivo);
        this.ColorOjos = newColorOjos;
        this.Nacionalidad = newNacionalidad;
        this.MayorEdad = newMayoEdad;
    }
    @Override
    public void Alimentacion(){
        System.out.println("Omnivoro");
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public void setNacionalidad(String newNacionalidad) {
        Nacionalidad = newNacionalidad;
        System.out.println(Nacionalidad);
    }
    public String Votar(String Candidato){
        if (MayorEdad){
            return Candidato = "Nemo";
        }
        else{
            return "No es mayor de edad.";
        }
    }
    public String toString(){
        return "Color de ojos: " + this.ColorOjos + ", Nacionalidad: " + this.Nacionalidad + ", Altura: " + this.Altura + ", años: " + this.Años;
    }
    public void Candidato(){
        System.out.println(toString());
        System.out.println(Votar(Candidato));
    }
}
class DemoHumano {
    public static void main(String[] args) {
        Humano a = new Humano();
        a.Candidato();
        Humano b = new Humano("azules", "australiano",false, 160, 75, 15,true);
        b.Candidato();
    }
}