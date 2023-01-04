package com.example.EJ_animal;

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
