package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak7ZaVezbanje {
    public static void main(String[] args) {
        //(Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
        //Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
        //primer jedne zamene:
        //Ako je niz
        //1,2,3,4,5,6,7,8,9,10
        //i prvi random indeks je 4 a drugi random indeks je 6
        //1,2,3,4,7,6,5,8,9,10

        ArrayList<Integer> brojevi = new ArrayList<>();

        Random random = new Random();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);
        brojevi.add(22);
        brojevi.add(23);
        brojevi.add(24);
        brojevi.add(25);
        brojevi.add(26);

        for (int i = 0; i < 8; i++) {
            int x = random.nextInt(brojevi.size());
            int cuvar = brojevi.get(x);
            int y = random.nextInt(brojevi.size());
            brojevi.set(x, brojevi.get(y));
            brojevi.set(y, cuvar);
            System.out.println(brojevi);
        }
    }
}
