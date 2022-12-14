package p14_12_2022;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost
//        za ta tri broja. Sve promenljive u programu su po tipu double

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi double broj: ");
        double prvi = s.nextDouble();

        System.out.print("Unesite drugi double broj: ");
        double drugi = s.nextDouble();

        System.out.print("Unesite treci double broj: ");
        double treci = s.nextDouble();

        double srednjaVrednost = (prvi+drugi+treci)/3;

        System.out.print("Srednja vrednost ova tri broja je: " + srednjaVrednost);

    }
}
