package kołoikyżyk;

public class kołoikyżyk {
    public static void main(String[] args) {
        int wymiar = 3;
        char[][] plansza = //new char[wymiar][wymiar];
                {{'O', 'X', 'X'},
                        {'O', 'X', ' '},
                        {' ', 'O', 'O'}};
        kołoikyżyk.drukujPlansza(plansza);
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
