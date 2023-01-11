package p10_1_2023;

public class Korisnik {
    //Kreirati klasu Korisnik koja ima
    //ime
    //prezime
    //gettere i settere za ime i prezime
    //konstuktore koje mislite da su vam potrebni
    //metoda koja stampa u formatu:
    //(ime) (prezime)


    private String ime;

    private String prezime;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Korisnik() {
    }

    public void stampaj(){
        System.out.println(this.ime + " " + this.prezime);
    }
}
