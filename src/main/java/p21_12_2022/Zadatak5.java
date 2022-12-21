package p21_12_2022;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
        // i racuna i stampa sumu svih brojeva niza.
        //Primer: Ako je niz 1,2,4,5,7
        //Stampa se, suma = 19

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        int suma = 0;

        for (int i = 0; i < brojevi.size(); i++) {
            suma=suma+brojevi.get(i);
        }

        System.out.println("suma = " + suma);

    }
}
