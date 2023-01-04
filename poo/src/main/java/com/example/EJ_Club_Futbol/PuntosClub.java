package com.example.EJ_Club_Futbol;

class PuntosClub extends ClubFutbol{
    private int PartidosGanados;
    private int PartidosEmpatados;
    private int PartidosPerdidos;

    public PuntosClub (){
        super();
        this.PartidosGanados = 20;
        this.PartidosEmpatados = 7;
        this.PartidosPerdidos = 3;
    }
    public PuntosClub(int newPartidosGanados,
        int newPartidosEmpatados, 
        int newPartidosPerdidos,
        String newUbicacion, 
        String newNombreClub,
        String newNombreEstadio, 
        String newFechaFundacion,
        String newColores){
        super(newUbicacion, newNombreClub, newNombreEstadio, newFechaFundacion, newColores);
        this.PartidosGanados = newPartidosGanados;
        this.PartidosEmpatados = newPartidosEmpatados;
        this.PartidosPerdidos = newPartidosPerdidos;    
    }
    public int puntos(){
        return PartidosGanados*3 + PartidosEmpatados*1 + PartidosPerdidos*0;
    }
    
    public void campeon(String NombreClub, int Puntaje){
        if (Puntaje > 40){
            System.out.println("Campeon");
        }
        if (Puntaje < 20){
            System.out.println("Descenso");
        }

    }
}
