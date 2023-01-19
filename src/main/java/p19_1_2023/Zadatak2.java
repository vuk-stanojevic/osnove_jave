package p19_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak 2.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi. NE NAZIVAJTE KLASU OBJECT !!
//adresa (ulica i broj)
//povrsina objekta
//zona (1, 2 ili 3)
//konstuktore, gettere i settere
//metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//zona 1, koeficijent je 1.4
//zona 2, koeficijent je 1.1
//zona 3, koeficijent je 1.05
//abstraktnu metodu koja racuna i vraca porez objekta
//abstraktnu metodu stampaj
//
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
//konstuktore, gettere i setter
//porez racuna po formuli: koeficijent * povrsina.
//prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//broj stanova
//konstuktore, gettere i setter
//porez racuna po formuli koeficijent * povrsina * broj stanova
//prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//
//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//konstuktore
//porez racuna po formuli koeficijent * povrsina * 1.3
//prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//ime grada u kom se nalazi
//niz objekata
//metodu dodaj objekat
//(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//(za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//metodu koja racuna ukupan porez za ceo grad
//metodu koja stampa sve objekte
//U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.

        PoreskaUprava nis = new PoreskaUprava("Nis");

        Objekat zuta = new Kuca("Vozdova 1", 140, 1, 4);
        Objekat novogradnja = new Zgrada("Cvijiceva 13", 1200, 2, 25);
        Objekat kafic = new Lokal("Vizantijski bulevar 78", 90, 3);

        nis.dodajObjekat(zuta);
        nis.dodajObjekat(novogradnja);
        nis.dodajObjekat(kafic);

        zuta.stampaj();
        System.out.println(zuta.porez());
        System.out.println();

        novogradnja.stampaj();
        System.out.println(novogradnja.porez());
        System.out.println();

        kafic.stampaj();
        System.out.println(kafic.porez());
        System.out.println();

       //za vezbanje  - metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
        System.out.println("Najveci porez je za objekat na adresi " + nis.najveciPorez().getUlicaIBroj());

        System.out.println("Ukupan porez za ceo grad je: " + nis.ukupanPorezZaCeoGrad());

        nis.stampaj();

    }
}
