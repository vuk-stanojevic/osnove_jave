package domaci_10_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2. Zadatak (POGLEDAJ SLIKU)
//Kreirati klasu Proizvod koja ima
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
//
//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//popust (u rasponu od 5 do 10 %)
//broj kartice (npr: 9329-0239)
//gettere i setter
//konstuktore

        ClanskaKarta kartica = new ClanskaKarta(8, "1234-5678");

        Kupac musterija = new Kupac("Aleksandar Aleksandrovic", kartica);

        Proizvod artikal = new Proizvod("Milka 300g", musterija, 117.8);

        musterija.stampaj();
        System.out.println();
        artikal.stampaj();

    }
}
