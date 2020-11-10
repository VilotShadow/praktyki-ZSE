package ćwiczenia;

public class Mechanik  extends Human{

    protected String nrtelefonu;
    boolean czy_wykonuje_prace = false;

    String prace;

    public Mechanik(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, Human[] rodzice, String nrtelefonu , boolean czy_wykonuje_prace, String prace){
        super(wzrost, plec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.nrtelefonu = nrtelefonu;
        this.czy_wykonuje_prace= czy_wykonuje_prace;
        this.prace = prace;





    }






}
