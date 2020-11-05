package zadania1;

public class uczen {

       private  String imie ;
       private String nazwisko ;
       private int wiek ;

       public void setimie( String imie){
           this.imie = imie;
       }
    public void setnazwisko( String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setwiek(int wiek){
        this.wiek = wiek;
    }
    public String getimie(){
           this.imie = imie;
           return imie;

    }
    public String getnazwisko(){
           this.nazwisko = nazwisko;
           return nazwisko;
    }
    public int getwiek(){
           return wiek;
    }







}
