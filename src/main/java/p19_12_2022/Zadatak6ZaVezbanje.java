package p19_12_2022;

import java.util.Scanner;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {

//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva
//        i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int rezultujuciBroj = 0;

        for (int i = 1; i <=n; i++) {
            System.out.print("Unesite jednocifreni broj: ");
            int broj = s.nextInt();
            rezultujuciBroj = (rezultujuciBroj*10) + broj;
        }
        System.out.println("Rezultujuci broj je " + rezultujuciBroj);
    }
}
