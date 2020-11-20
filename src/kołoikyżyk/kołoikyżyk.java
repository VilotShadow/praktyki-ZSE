package kołoikyżyk;

import java.util.Scanner;

public class kołoikyżyk {
    public static void main(String[] args) {
        System.out.println("Witaj w grze podaj rozmiary planszy ");
        int wymiar = new Scanner(System.in).nextInt();
        char symbolobecnegoGracza = 'X';
        char[][] plansza = new char[wymiar][wymiar];

        boolean czyKontynuować = true;
        int licznikRuchow = 0;
        while (czyKontynuować && licznikRuchow <= wymiar*wymiar ) {
            kołoikyżyk.drukujPlansza(plansza);
            boolean ruchPoprawny = wykonajRuch(plansza, symbolobecnegoGracza);
            if (ruchPoprawny) {
                licznikRuchow++;
                boolean wygranaWiersze = sprawdzWiersze (plansza, symbolobecnegoGracza);
                boolean wygranaKolumny = sprawdzKolumny (plansza, symbolobecnegoGracza);
                boolean wygranaSkos1 = sprawdzSkos1(plansza, symbolobecnegoGracza);
                //boolean wygranaSkos2 = sprawdzSkos2(plansza, symbolobecnegoGracza);
                if(wygranaWiersze || wygranaKolumny || wygranaSkos1 ){
                    System.out.println( " SUPER WYGRANA "+ symbolobecnegoGracza);
                    czyKontynuować = false;
                }
                symbolobecnegoGracza = symbolobecnegoGracza == 'X' ? 'O' : 'X';
            }
        }


        // if(symbolobecnegoGracza == 'X'){
        //                symbolobecnegoGracza = 'O';
        //            }
        //            else {
        //                symbolobecnegoGracza = 'X';
        //            }

    }

    public static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int wiersz = 0; wiersz < wiersz; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana){ return true;}
        }
        return false;
    }
    public static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz< wymiar; wiersz ++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana){ return true;}
        }
        return false;
    }
    public static boolean sprawdzSkos1 (char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][i]!=symbol) {
                return false;
            }
        }
        return true;
    }
  //  public static boolean sprawdzSkos2 (char[][] plansza, char symbol) {
     //   int wymiar = plansza.length;
   //     for (int i = 0; i <= wymiar; i++) {
          //  for (int y = 2; y > wymiar; y--) {
           //     if (plansza[i][y] != symbol) {
            //        return false;
        //        }

      //      }
    //    }
       //     return true;
    //    }


    public static boolean wykonajRuch(char[][] plansza, char symbol) {
        System.out.println(symbol + " Twój ruch");
        System.out.println(" Podaj indeks wiersza ");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println(" Popdaj Kolumne ");
        int kolumna = new Scanner(System.in).nextInt();
        boolean ruchpoprawny = plansza[wiersz][kolumna] == 0;
        if (!ruchpoprawny) {
            System.out.println(" Dupa coś tam jest i zły ruch ");
            return false;
        }
        plansza[wiersz][kolumna] = symbol;
        return true;

    }

    public static void drukujPlansza(char[][] plansza) {
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