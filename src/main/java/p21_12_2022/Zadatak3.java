package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
// i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.

        ArrayList <Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        int valueHolder = brojevi.get(0);

        brojevi.set(0, brojevi.get(brojevi.size()-1));
        brojevi.set(brojevi.size()-1, valueHolder);

        System.out.println("Nulti element je sad: " + brojevi.get(0));
        System.out.println("Poslednji element je sad: " + brojevi.get(brojevi.size()-1));

    }
}
