package domaci_10_1_2023;

public class Kupac {
//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice


    private String imeIPrezime;

    private ClanskaKarta brojClanskeKarte;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getBrojClanskeKarte() {
        return brojClanskeKarte;
    }

    public Kupac(String imeIPrezime, ClanskaKarta brojClanskeKarte) {
        this.imeIPrezime = imeIPrezime;
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " " + this.brojClanskeKarte.getBrojKartice());
    }
}
