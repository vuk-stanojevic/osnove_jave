package p13_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//  Zadatak
//
//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je cena.din
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti

        Sastojak testenina = new Sastojak("testenina", 30);
        Sastojak paradajzSos = new Sastojak("paradajz sos", 40);
        Sastojak parmezan = new Sastojak("parmezan", 50);
        Sastojak mlevenoMeso = new Sastojak("mleveno meso", 60);
        Sastojak slanina = new Sastojak("slanina", 45);
        Sastojak sampinjoni = new Sastojak("sampinjoni", 30);
        Sastojak jaja = new Sastojak("jaja", 40);
        Sastojak pavlaka = new Sastojak("pavlaka", 60);
        Sastojak piletina = new Sastojak("piletina", 60);

        Pasta bolonjeze = new Pasta();
        bolonjeze.dodajSastojak(testenina);
        bolonjeze.dodajSastojak(paradajzSos);
        bolonjeze.dodajSastojak(mlevenoMeso);
        bolonjeze.dodajSastojak(parmezan);

        Pasta karbonara = new Pasta();
        karbonara.dodajSastojak(testenina);
        karbonara.dodajSastojak(slanina);
        karbonara.dodajSastojak(jaja);
        karbonara.dodajSastojak(pavlaka);
        karbonara.dodajSastojak(parmezan);

        System.out.println("Cena paste bolonjeze je " + bolonjeze.cenaPaste());
        bolonjeze.stampa();
        System.out.println();

        bolonjeze.brisiSastojak("testenina");
        bolonjeze.stampa();
        System.out.println();

        karbonara.stampa();
        karbonara.brisiSastojak("pavlaka");
        System.out.println();
        karbonara.stampa();
    }
}
