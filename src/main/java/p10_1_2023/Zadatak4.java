package p10_1_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//Kreirati klasu Korisnik koja ima
//ime
//prezime
//gettere i settere za ime i prezime
//konstuktore koje mislite da su vam potrebni
//metoda koja stampa u formatu:
//(ime) (prezime)
//
//Kreirati klasu FacebookPost
//opis
//korisnik (referenca na korisnika koji je kreirao post)
//konstrukore koje mislite da su vam potrebni
//metoda print, stampa u formatu:
//(ime) (prezime)
//(opis post-a)
//
//U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

        Korisnik janko = new Korisnik();
        janko.setIme("Janko");
        janko.setPrezime("Jankovic");
        janko.stampaj();
        System.out.println();

        FacebookPost objava = new FacebookPost("blabla bla mwa sretjo <3", janko);
        objava.stampaj();

    }
}
