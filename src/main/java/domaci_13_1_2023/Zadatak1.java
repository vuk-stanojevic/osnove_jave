package domaci_13_1_2023;

import domaci_12_1_2023.ZeleniKarton;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

        Student brucos = new Student(12345, "Marko Markovic", "osnovne");

        Ispit matematika = new Ispit("Matematika", "Rene Dekart", 9);
        Ispit fizika = new Ispit("Fizika", "Ricard Fejnman", 10);
        Ispit hemija = new Ispit("Hemija", "Dmitrij Mendeljejev", 8);
        Ispit fizicko = new Ispit("Fizicko", "Jusein Bolt", 5);
        Ispit muzicko = new Ispit("Muzicko", "Nils Fram", 7);
        Ispit likovno = new Ispit("Likovno", "Rene Magrit", 6);
        Ispit informatika = new Ispit("Informatika", "Kevin Mitnik", 10);
        Ispit tehnicko = new Ispit("Tehnicko", "Le Korbizje", 9);
        Ispit srpski = new Ispit("Srpski", "Branislav Nusic", 10);
        Ispit engleski = new Ispit("Engleski", "Barak Obama", 5);
        Ispit geografija = new Ispit("Geografija", "Vasko Da Gama", 10);

        brucos.dodajIspit(matematika);
        brucos.dodajIspit(fizika);
        brucos.dodajIspit(hemija);
        brucos.dodajIspit(fizicko);
        brucos.dodajIspit(muzicko);
        brucos.dodajIspit(likovno);
        brucos.dodajIspit(informatika);
        brucos.dodajIspit(tehnicko);
        brucos.dodajIspit(srpski);
        brucos.dodajIspit(engleski);
        brucos.dodajIspit(geografija);

        brucos.stampaj();
        System.out.println();

        System.out.println(matematika.ispitPolozen());
        System.out.println(engleski.ispitPolozen());
        muzicko.stampaj();
        System.out.println();

        System.out.println(brucos.prosekPolozenih());

    }
}
