package SlackZadaciZaVezbanje;

import java.util.Scanner;

public class ZadatakPetocifreniStampa {
    public static void main(String[] args) {

//        Napisati program koji od 5tocifrenog broja izvlaci sve sifre i stampa ih na ekranu
//        Primer
//        Unesite broj: 17351
//        1, 7, 3, 5, 1

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite petocifreni broj: ");
        int broj = s.nextInt();

        int delilac = 10000;

        for (int i = 1; i<=5; i++) {
           int cifra = broj/delilac;
            System.out.print(cifra + ", ");
            broj=broj-(cifra*delilac);
            delilac=delilac/10;
        }
    }
}
