package p10_1_2023;

public class FacebookPost {
    //Kreirati klasu FacebookPost
    //opis
    //korisnik (referenca na korisnika koji je kreirao post)
    //konstrukore koje mislite da su vam potrebni
    //metoda print, stampa u formatu:
    //(ime) (prezime)
    //(opis post-a)
    //
    //U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

    private String opis;

    private Korisnik autor;

    public FacebookPost (String opis, Korisnik autor) {
        this.opis = opis;
        this.autor = autor;
    }

    public void stampaj(){
        System.out.println(this.autor.getIme() + " " + this.autor.getPrezime());
        System.out.println(this.opis);
    }

}
