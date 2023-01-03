package domaci_29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
// Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
// a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
// Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod patike = new Proizvod();
        patike.naziv = "Nike patike";
        patike.cena = 3990;
        patike.masaGrami = 680;

        patike.stampaj();
        patike.povecajCenu(500);
        System.out.println("Nakon poskupljenja od 500 dinara, nova cena ovog predmeta je " + patike.cena);
        System.out.println("Cena ovih patika na popustu od 30% bi bila " + patike.vratiCenuSaPopustom(30) + " dinara.");
        System.out.println("Postarina za ovaj predmet iznosi " + patike.racunajPostarinu() + " dinara.");
        System.out.println();

        Proizvod majica = new Proizvod();
        majica.naziv = "Majica za fizicko";
        majica.cena = 750;
        majica.masaGrami = 325;

        majica.stampaj();
        majica.povecajCenu(100);
        System.out.println("Nakon poskupljenja od 100 dinara, nova cena ovog proizvoda je " + majica.cena);
        System.out.println("Cena ove majice na popustu od 15% bi bila " + majica.vratiCenuSaPopustom(15) + " dinara.");
        System.out.println("Postarina za ovaj predmet iznosi " + majica.racunajPostarinu() + " dinara.");
        System.out.println();

        Proizvod formular = new Proizvod();
        formular.naziv = "FT1P";
        formular.cena = 120;
        formular.masaGrami = 12;

        formular.stampaj();
        formular.povecajCenu(140);
        System.out.println("Nakon poskupljenja od 140 dinara, nova cena ovog proizvoda je " + formular.cena);
        System.out.println("Cena ovog formulara na popustu od 60% bi bila " + formular.vratiCenuSaPopustom(60) + " dinara.");
        System.out.println("Postarina za ovaj predmet iznosi " + formular.racunajPostarinu() + " dinara.");

    }
}
