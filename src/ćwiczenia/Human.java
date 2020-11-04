package ćwiczenia;

public class Human {

     private double wrzost;
     private char Plec; // m- meszczyna // k - kobieta // c - cos innego
     private double rozmiar_buta;
     private boolean czy_lyzy;
     private String color_wlosow;
     private int wiek;
     private Human[] rodzice;

    void setColor_wlosow(String color) {
        if(!czy_lyzy) {
        this.color_wlosow = color;
        }
        else{
         System.out.println(" przecież jest lysy");

        }

    }

    public void setPlec() {
        
    }
}
