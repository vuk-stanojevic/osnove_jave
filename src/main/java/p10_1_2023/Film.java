package p10_1_2023;

public class Film {

//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina

    private String naziv;

    private int godina;

    public Film(){

    }

    public Film (String naziv, int godina){
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampajFilm(){
        System.out.println(this.naziv + ", " + this.godina);
    }
}
