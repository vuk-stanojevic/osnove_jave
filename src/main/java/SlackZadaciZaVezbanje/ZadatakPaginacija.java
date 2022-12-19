package SlackZadaciZaVezbanje;

import java.util.Scanner;

public class ZadatakPaginacija {

    public static void main(String[] args) {

//        Za vezbanje
//        Primer tabele sa paginacijom
//        Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//        ukupan broj rezultata
//        broj rezultata po strani
//        stranu
//        Program ispisuje poruku koji rezultati ce biti prikazani.
//
//        Primer izvrsenja 1:
//        Unesite ukupan broj rezultata: 20
//        Unesite broj rezultata po strani: 5
//        Unesite stranu: 3
//        Prikaz: Showing 11 to 15 of 20 entries
//
//        Primer izvrsenja 2:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 3
//        Prikaz: Showing 21 to 23 of 23 entries
//
//        Primer izvrsenja 3:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 4
//        Prikaz: No results for page 4.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ukupan broj rezultata: ");
        int ukupnoRezultata = s.nextInt();

        System.out.print("Unesite broj rezultata po strani: ");
        int rezultataPoStrani = s.nextInt();

        System.out.print("Unesite broj strane: ");
        int brojStrane = s.nextInt();

        System.out.print("Prikaz: ");

        if (brojStrane>((ukupnoRezultata/rezultataPoStrani)+1)) {
            System.out.println("No results for page " + brojStrane + ".");
        } else {
            System.out.print("Showing " + (((brojStrane - 1) * rezultataPoStrani) + 1) + " to ");
            if ((brojStrane * rezultataPoStrani) > ukupnoRezultata) {
                System.out.print(ukupnoRezultata);
            } else {
                System.out.print(brojStrane * rezultataPoStrani);
            }
            ;
            System.out.println(" of " + ukupnoRezultata + " entries.");
        }
    }
}

