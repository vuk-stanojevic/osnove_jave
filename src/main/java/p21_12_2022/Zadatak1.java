package p21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

//        int lastIndex = brojevi.size() - 1;
//        int suma = brojevi.get(0) + brojevi.get(lastIndex);


        int suma = brojevi.get(0) + brojevi.get(4);

        System.out.println("Suma nultog i zadnjeg broja je: " + suma);


    }
}
