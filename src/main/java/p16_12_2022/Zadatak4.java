package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        //Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10)
        // i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
        //Primer izvrsenja;
        //Unesite jacinu zvuka: 8
        //< | | | | | | | |
        //
        //(Dopuna za vezbanje)
        //Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite jacinu zvuka od 0 do 10: ");
        int jacina = s.nextInt();

//        bolje da se if ubaci u for petlju kao dole
//        if(jacina==0) {
//            System.out.print("</");
//        }

            System.out.print("<");

            for (int i = 0; i < jacina; i++) {
                System.out.print("|");
            } if (jacina==0) {
                System.out.print("/");
            }
        }
    }
