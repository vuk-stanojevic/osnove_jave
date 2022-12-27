package p20_12_2022;

import java.util.Scanner;

public class Zadatak6ZaVezbanje {
    public static void main(String[] args) {
//        (ZA VEZBANJE) Napisati program koji izvlaci cifre iz visecifrenog broja.
//        Broj koji se unosi je proizvoljan.
//        Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
//Primer izvrsenja:
//Unesite broj: 2109349
//9, 4, 3, 0, 9, 1, 2

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj sa najvise 10 cifara: ");
        int broj = s.nextInt();

        while(broj>0){
            int cifra = broj % 10;
            System.out.print(cifra + ", ");
            broj = broj/10;
        }
    }
}
