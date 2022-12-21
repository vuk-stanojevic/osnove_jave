package p21_12_2022;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
//        i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.

        ArrayList <Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        brojevi.set(3, (brojevi.get(3)*10));

        System.out.println("Nova vrednost broja na poziciji 3 je: " + brojevi.get(3));
    }
}
