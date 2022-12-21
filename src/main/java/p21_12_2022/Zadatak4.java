package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
// koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        System.out.print("Unesite K - poziciju elementa: ");
        int k = s.nextInt();

        System.out.println("Na poziciji " + k + " je vrednost " + brojevi.get(k));

        System.out.println(brojevi);
    }
}
