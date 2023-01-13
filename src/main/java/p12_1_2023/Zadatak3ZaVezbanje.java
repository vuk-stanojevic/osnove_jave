package p12_1_2023;

public class Zadatak3ZaVezbanje {
    public static void main(String[] args) {
//        3.Zadatak (Za vezbanje)
//Kreirati klasu ViberKorisnik koja ima:
//ime i prezime
//broj telefona
//da li je trenutno aktivan (boolean)
//gettere, settere, konstuktore
//
//Kreirati klasu ViberPoruka koja ima:
//tekst poruke
//vreme kad je poslata poruka
//korisnika koji je poslao poruku
//korisnika kome je poslata poruka
//gettere i setere i konstuktore
//rekaciju na poruku
//metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//if (this.reakcija != null)
//
//Kreirati klasu ViberReakcija koja ima:
//emoji (moze da bude sunglases, heart, smile, like ili sad)
//korisnika koji je reagovao
//U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

        ViberKorisnik milan = new ViberKorisnik("Milan Jovanovic", "0631234567", true);
        ViberKorisnik vlada = new ViberKorisnik("Vladimir Minic", "0647884848", false);

        ViberPoruka prva = new ViberPoruka("kad ce zavrsimo u petak?", "18:12:45", milan, vlada, null);

        ViberReakcija reakcija = new ViberReakcija("heart", milan);
        ViberPoruka druga = new ViberPoruka("moze u 20h", "18:12:57", vlada, milan, reakcija);

        prva.stampaj();
        druga.stampaj();

    }
}
