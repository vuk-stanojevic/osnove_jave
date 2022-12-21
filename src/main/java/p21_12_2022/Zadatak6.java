package p21_12_2022;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {

        //Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
        //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        for (int i = brojevi.size()-1; i >= 0 ; i--) {
            System.out.println(brojevi.get(i));
        }


    }
}
