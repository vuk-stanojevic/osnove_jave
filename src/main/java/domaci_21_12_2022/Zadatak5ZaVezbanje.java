package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5ZaVezbanje {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji ucitava niz a duzine N.
//        Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1

        ArrayList<Integer> a = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int unos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            a.add(unos=s.nextInt());
        }

        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i<3){
                b.add(a.get(i));
            } else {
                b.add(1);
            }
        }
//        varijanta 1, da odstampa ceo niz odjednom, pa se to prikazuje u uglastim zagradama:
//        System.out.println("Niz a: " + a);
//        System.out.println("Niz b: " + b);

        System.out.println();
        System.out.print("Niz a: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Niz b: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b.get(i) + ", ");
        }
    }
}
