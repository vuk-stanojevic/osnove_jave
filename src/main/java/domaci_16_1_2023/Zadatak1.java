package domaci_16_1_2023;

import java.util.ArrayList;
import java.util.Scanner;

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

        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

//        Igrac zoki = new Igrac("Zoran", "Jovanovic", "1212197554545", 1975, 6, "zadnji vezni", true);
//        Igrac urke = new Igrac("Uros", "Milenovic", "1212121212121", 1999, 9, "spic", false);
//
//        zoki.stampaj();
//        urke.stampaj();
//        System.out.println();
//
//        Trener venger = new Trener("Arsen", "Venger", "787878787878", 1959, 31, "za igru");
//        Trener murinjo = new Trener("Zoze", "Murinjo", "66666666666", 1970, 24, "pomocni");
//
//        venger.stampaj();
//        murinjo.stampaj();
//        System.out.println();

        Igrac jovca = new Igrac();
        System.out.print("Unesite ime: ");
        jovca.setIme(s.next());
        System.out.print("Unesite prezime: ");
        jovca.setPrezime(s.next());
        System.out.print("Unesite JMBG: ");
        jovca.setJmbg(s.next());
        System.out.print("Unesite godinu rodjenja: ");
        jovca.setGodinaRodjenja(s.nextInt());
        System.out.print("Unesite broj: ");
        jovca.setBroj(s.nextInt());
        System.out.print("Unesite poziciju: ");
        jovca.setPozicija(s.next());
        System.out.print("Unesite da li je kapiten: ");
        jovca.setKapiten(s.nextBoolean());
        System.out.println();

        Igrac zeki = new Igrac();
        System.out.print("Unesite ime: ");
        zeki.setIme(s.next());
        System.out.print("Unesite prezime: ");
        zeki.setPrezime(s.next());
        System.out.print("Unesite JMBG: ");
        zeki.setJmbg(s.next());
        System.out.print("Unesite godinu rodjenja: ");
        zeki.setGodinaRodjenja(s.nextInt());
        System.out.print("Unesite broj: ");
        zeki.setBroj(s.nextInt());
        System.out.print("Unesite poziciju: ");
        zeki.setPozicija(s.next());
        System.out.print("Unesite da li je kapiten: ");
        zeki.setKapiten(s.nextBoolean());
        System.out.println();

        igraci.add(jovca);
        igraci.add(zeki);

        Trener ferguson = new Trener();
        System.out.print("Unesite ime: ");
        ferguson.setIme(s.next());
        System.out.print("Unesite prezime: ");
        ferguson.setPrezime(s.next());
        System.out.print("Unesite JMBG: ");
        ferguson.setJmbg(s.next());
        System.out.print("Unesite godinu rodjenja: ");
        ferguson.setGodinaRodjenja(s.nextInt());
        System.out.print("Unesite godine iskustva: ");
        ferguson.setGodineIskustva(s.nextInt());
        System.out.print("Unesite tip trenera: ");
        ferguson.setTipTrenera(s.next());
        System.out.println();

        Trener anceloti = new Trener();
        System.out.print("Unesite ime: ");
        anceloti.setIme(s.next());
        System.out.print("Unesite prezime: ");
        anceloti.setPrezime(s.next());
        System.out.print("Unesite JMBG: ");
        anceloti.setJmbg(s.next());
        System.out.print("Unesite godinu rodjenja: ");
        anceloti.setGodinaRodjenja(s.nextInt());
        System.out.print("Unesite godine iskustva: ");
        anceloti.setGodineIskustva(s.nextInt());
        System.out.print("Unesite tip trenera: ");
        anceloti.setTipTrenera(s.next());
        System.out.println();

        treneri.add(ferguson);
        treneri.add(anceloti);

        for (int i = 0; i < igraci.size(); i++) {
            System.out.println("Ime: " + igraci.get(i).getIme());
            System.out.println("Prezime: " + igraci.get(i).getPrezime());
            System.out.println("JMBG: " + igraci.get(i).getJmbg());
            System.out.println("Godina rodjenja: " + igraci.get(i).getGodinaRodjenja());
            System.out.println("Broj: " + igraci.get(i).getBroj());
            System.out.println("Pozicija: " + igraci.get(i).getPozicija());
            System.out.println("Kapiten: " + igraci.get(i).isKapiten());
            System.out.println();
        }

        for (int i = 0; i < treneri.size(); i++) {
            System.out.println("Ime: " + treneri.get(i).getIme());
            System.out.println("Prezime: " + treneri.get(i).getPrezime());
            System.out.println("JMBG: " + treneri.get(i).getJmbg());
            System.out.println("Godina rodjenja: " + treneri.get(i).getGodinaRodjenja());
            System.out.println("Godine iskustva: " + treneri.get(i).getGodineIskustva());
            System.out.println("Tip trenera: " + treneri.get(i).getTipTrenera());
            System.out.println();
        }
    }
}
