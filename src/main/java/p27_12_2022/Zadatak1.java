package p27_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//        Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700
        Scanner s = new Scanner(System.in);

        Racun posiljalac = new Racun();

        posiljalac.brojRacuna="170-541554-44";
        posiljalac.imeIPrezime = "Marko Markovic";
        posiljalac.stanje = 177477.23;

        System.out.println("Posiljac: " + posiljalac.imeIPrezime + " " + posiljalac.brojRacuna + " - stanje: " + posiljalac.stanje);

        Racun primalac = new Racun();
        primalac.brojRacuna = "484-111111-55";
        primalac.imeIPrezime = "Milica Milicic";
        primalac.stanje = 115151.22;
        System.out.println("Primalac: " + primalac.imeIPrezime + " " + primalac.brojRacuna + " - stanje: " + primalac.stanje);

        System.out.print("Unesite sumu za transakciju:");
        int suma = s.nextInt();

        posiljalac.stanje = posiljalac.stanje-suma;
        primalac.stanje = primalac.stanje+suma;
        System.out.println("Stanje nakon transakcije");
        System.out.println("Posiljac: " + posiljalac.imeIPrezime + " " + posiljalac.brojRacuna + " - stanje: " + posiljalac.stanje);
        System.out.println("Primalac: " + primalac.imeIPrezime + " " + primalac.brojRacuna + " - stanje: " + primalac.stanje);
    }
}
