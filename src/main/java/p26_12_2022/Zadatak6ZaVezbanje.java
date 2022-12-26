package p26_12_2022;

import java.util.Scanner;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {
//Napisati main program koji koristi metodu definisanu u 6.zad tako da stampa sledecu sliku za M. M unosi korisnik.
//Primer izvrsenja:
//Unesite M: 6
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = s.nextInt();
        stampa(m);
    }

    public static void stampa(int m){

        for (int i = 1; i <= m; i++) {
            Zadatak6.stampaZvezdica(i);
        }
    }
}
