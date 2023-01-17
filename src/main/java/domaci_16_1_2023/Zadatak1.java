package domaci_16_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//  1.Zadatak
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
// Podatke za igrace i trenere unosi korisnik sa tastature.

        Igrac zoki = new Igrac("Zoran Jovanovic", "1212197554545", 1975, 6, "zadnji vezni", true);
        Igrac urke = new Igrac("Uros Milenovic", "1212121212121", 1999, 9, "spic", false);

        zoki.stampaj();
        urke.stampaj();
        System.out.println();

        Trener venger = new Trener("Arsen Venger", "787878787878", 1959, 31, "za igru");
        Trener murinjo = new Trener("Zoze Murinjo", "66666666666", 1970, 24, "pomocni");

        venger.stampaj();
        murinjo.stampaj();

    }
}
