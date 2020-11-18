package kołoikyżyk;

import java.util.Scanner;

public class kołoikyżyk {
    public static void main(String[] args) {
        System.out.println("Witaj w grze podaj rozmiary planszy ");
    int wymiar = new Scanner(System.in).nextInt();
    char symbolobecnegoGracza = 'X';
    char[][] plansza = new char[wymiar][wymiar];
    while (true) {
        kołoikyżyk.drukujPlansza(plansza);
        boolean ruchPoprawny = wykonajRuch(plansza, symbolobecnegoGracza);
        if (!ruchPoprawny) continue;
        symbolobecnegoGracza = symbolobecnegoGracza == 'X' ? 'O' : 'X';
    }


    // if(symbolobecnegoGracza == 'X'){
    //                symbolobecnegoGracza = 'O';
    //            }
    //            else {
    //                symbolobecnegoGracza = 'X';
    //            }

}

        public static  boolean wykonajRuch(char [] [] plansza, char symbol){
        System.out.println(symbol+ " Twój ruch");
        System.out.println(" Podaj indeks wiersza ");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println(" Popdaj Kolumne ");
        int kolumna = new Scanner(System.in).nextInt();
        boolean ruchpoprawny = plansza [wiersz] [kolumna] == 0;
        if(!ruchpoprawny) {
            System.out.println(" Dupa coś tam jest i zły ruch ");
            return false ;
        }
            plansza [wiersz] [kolumna] = symbol;
            return true;

    }
    public static void drukujPlansza (char [][] plansza ) {
        int wymiar = plansza.length;

        //nagłówki kolumn
        System.out.print("\t");
        //pętla pokazująca nagłówki kolumn
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //drukowanie wierszy
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + "\t");
            }
            System.out.println();


        }
    }
}
