package com.example.EJ_animal;

class perro extends animal {
    private String Raza;
    private String Tamaño;
    private boolean Domestico;

    public perro (){
        super();
        this.Raza = "Ovejero aleman";
        this.Tamaño = "Mediano";
        this.Domestico = true;
    }
    public perro(String newRaza,
        String newTamaño,
        Boolean newDomestico,
        int newAltura,
        int newPeso,
        int newAños,
        boolean newVivo){
        super(newAltura, newPeso, newAños, newVivo);
        this.Raza = newRaza;
        this.Tamaño = newTamaño;
        this.Domestico = newDomestico;
    }
    @Override
    public void Alimentacion(){
        System.out.println("Carnivoro");
    }

    public String toString(){
        return "Raza: " + this.Raza + ", Tamaño: " + this.Tamaño + ", Domestico: " + this.Domestico;
    }
    public String Edad(boolean mayor18){
        if (mayor18 == true){
            return "Es mayor de edad";
        }
        else {
            return "Es menor de edad";
        }
    } 
    public String ladra(){
        if (Domestico == false){
            return "Ladrar";
        }
        else {
            return "No Ladrar";
        }
    }
}

