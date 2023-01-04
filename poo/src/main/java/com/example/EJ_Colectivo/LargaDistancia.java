package com.example.EJ_Colectivo;

class LargaDistancia extends Colectivo{
    private String Empresa;
    private boolean Internacional;
    private String Asientos;
    private int KMS;

    public LargaDistancia(){
        super();
        this.Empresa = "Chevalier";
        this.Internacional = true;
        this.Asientos = "cama";
        this.KMS = 1250;
    }
    public LargaDistancia(String newEmpresa,
        boolean newInternacional,
        String newAsientos,
        int newKMS,
        int newPasajeros,
        int newMaxPjros,
        int newAntiguedad){
        super(newPasajeros, newMaxPjros, newAntiguedad);
        this.Empresa = newEmpresa;
        this.Internacional = newInternacional;
        this.Asientos = newAsientos;
        this.KMS = newKMS;
    }
    @Override
    public void patente() {
        System.out.println("ABC 123");
    }

    public void ControlPolicial(){
        if (Internacional == true){
            System.out.println("CONTROL OBLIGATORIO");
            }
        }
    public void valorPasaje(){
        if (Internacional == true && Asientos == "cama" && KMS >=1000){
            System.out.println(12000);
            }
        if (Internacional == true && Asientos == "semicama" && KMS >=1000){
            System.out.println(1000);
            }
        if (Internacional == true && Asientos == "cama" && KMS < 1000){
            System.out.println(8000);
            }
        if (Internacional == true && Asientos == "semicama" && KMS < 1000){
            System.out.println(7000);
            }    
        if (Internacional == false && Asientos == "semicama" && KMS >= 800){
            System.out.println(5000);
            }
        if (Internacional == false && Asientos == "comun" && KMS >= 800){
            System.out.println(4000);
            }
        if (Internacional == false && Asientos == "semicama" && KMS < 800){
            System.out.println(3000);
            }
        if (Internacional == false && Asientos == "comun" && KMS < 800){
            System.out.println(3000);
            }
        }
        public String toString(){
            return "Empresa: " + this.Empresa +
                ", Internacional: " + this.Internacional +
                ", Asientos: " + this.Asientos +
                ", Kilometros: " + this.KMS;
        }
}
