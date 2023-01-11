package domaci_10_1_2023;

public class Proizvod {
//    Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice

    private String naziv;

    private Kupac imeKupca;

    private double cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String naziv, Kupac imeKupca, double cenaIzrade) {
        this.naziv = naziv;
        this.imeKupca = imeKupca;
        this.cenaIzrade = cenaIzrade;
    }

    public double racunanjeCene(){
       return this.cenaIzrade*1.9*(100-this.imeKupca.getBrojClanskeKarte().getPopust())/100;
    }

    public void stampaj(){
        System.out.println(this.naziv + " - " + this.racunanjeCene());
        this.imeKupca.stampaj();
    }

}
