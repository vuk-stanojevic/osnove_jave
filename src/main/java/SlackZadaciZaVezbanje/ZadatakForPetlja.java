package SlackZadaciZaVezbanje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ZadatakForPetlja {
    public static void main(String[] args) {
//Zadatak (For petlja)
//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
// Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
// tj. ne unosi ih korisnik. Program stampa tabelu na ekranu
// a zatim od korisnika trazi da unese kolonu po kojoj bi zeleo da sumira vrednosti
// i na kraju programa ispisuje sumu za trazenu kolonu. POGLEDAJ SLIKU
//Primer izvrsenja:
//3,1,8,0,1,
//1,5,7,9,6,
//3,1,6,5,1,
//4,5,8,1,7,
//1,3,2,8,0,
//Unesite kolonu za sumiranje: 2
//Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

        ArrayList<Integer> brojevi = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        Random random = new Random();

        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));
        brojevi.add(random.nextInt(10));

        for (int i = 1; i <= 25; i++) {
            System.out.print(brojevi.get(i-1) + ", ");
            if(i%5==0){
                System.out.println();
            }
        }

        System.out.print("Unesite kolonu (1-5): ");
        int kolona = s.nextInt();
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            suma = suma+brojevi.get(kolona-1);
            kolona=kolona+5;
        }

        System.out.println("Suma te kolone je " + suma);

    }
}
