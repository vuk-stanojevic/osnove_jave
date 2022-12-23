package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
        // i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
        //Primer:
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11
        //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> brojevi = new ArrayList();

        Scanner s = new Scanner(System.in);

        brojevi.add(20);
        brojevi.add(21);
        brojevi.add(22);
        brojevi.add(23);
        brojevi.add(24);
        brojevi.add(25);
        brojevi.add(26);
        brojevi.add(27);
        brojevi.add(28);
        brojevi.add(29);

        System.out.print("Unesite novu poziciju od 0 do 9: " );
        int pozicija = s.nextInt();

        System.out.print("Unesite novu vrednost: " );
        int vrednost = s.nextInt();

        brojevi.set(pozicija, vrednost);
    }
}
