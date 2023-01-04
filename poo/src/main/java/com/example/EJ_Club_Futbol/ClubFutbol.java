package com.example.EJ_Club_Futbol;

public class ClubFutbol implements Amonestaciones{
    protected String Ubicacion;
    protected String NombreClub;
    protected String NombreEstadio;
    protected String FechaFundacion;
    protected String colores;

    public ClubFutbol(){
        this.Ubicacion = "Barracas";
        this.NombreClub = "Boca Juniors";
        this.NombreEstadio = "Alberto J. Armando";
        this.FechaFundacion = "03/04/1905";
        this.colores = "Azul y amarillo";
    }
    public ClubFutbol(String newUbicacion,
        String newNombreClub,
        String newNombreEstadio,
        String newFechaFundacion,
        String  newColores){
            this.Ubicacion = newUbicacion;
            this.NombreClub = newNombreClub;
            this.NombreEstadio = newNombreEstadio;
            this.FechaFundacion = newFechaFundacion;
            this.colores = newColores;
    }
    @Override
    public int autorizados(int JugAmonestados){
        if (JugAmonestados > TOTAL_DOBLE_AMONESTACION){
            return 11 - JugAmonestados;
        }
        return 0;
    }

    public void CamisetaAlternativa(String ColoresAlternativos){
        this.colores = ColoresAlternativos;
        System.out.println(this.colores);
    }
    public String CapacidadEstadio(int Capacidad){
        return "Capacidad: " + Capacidad + ", Estadio: " + this.NombreEstadio;
    }
}
