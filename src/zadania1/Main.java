package zadania1;

public class Main {
    public static void main(String[] args){
        uczen Ola = new uczen();
        Ola.setimie("Ola");
        Ola.setnazwisko("Szczukowska");
        Ola.setwiek(18);


        System.out.println(Ola.getimie() + " "+ Ola.getnazwisko() + " lat " + Ola.getwiek());

    }
}
