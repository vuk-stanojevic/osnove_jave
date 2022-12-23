package p19_12_2022;

import java.util.Scanner;

public class Zadatak9ZaVezbanje {

    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//        Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite petocifreni broj: ");
        int broj = s.nextInt();

        for (int i = 1; i <= 5; i++) {
            int cifra = broj % 10;
            System.out.print(cifra + ", ");
            broj = broj/10;
        }
    }
}
