package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
//        tako da ucitavanje elemenata u niz a bude obrnuto.
//        Primer:
//        Unesite N: 4
//        Unesite string: xxx1
//        Unesite string: xxx4
//        Unesite string: xxx6
//        Unesite string: xxx9
//
//        Niz a: xxx9, xxx6, xxx4, xxx1
//        Komentar: Stanje niza a u memoriji je:
//        a[0]="xxx9",
//                a[1]="xxx6",
//                a[2]="xxx4",
//                a[3]="xxx1",

        ArrayList<String> niz = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            niz.add(i, "placeholder");
        }

        for (int i=n-1; i>=0; i--) {
            System.out.print("Unesite string: ");
            niz.set(i, s.next());
        }

        System.out.println();
//varijanta 1, da odstampa ceo niz odjednom, pa se to prikazuje u uglastim zagradama:
//        System.out.println("Niz a: " + niz);

//        varijanta da kroz dodatnu for petlju stampa element po element:
        System.out.print("Niz a: ");
        for (int i = 0; i <n; i++) {
            System.out.print(niz.get(i) + ", ");
        }

    }
}
