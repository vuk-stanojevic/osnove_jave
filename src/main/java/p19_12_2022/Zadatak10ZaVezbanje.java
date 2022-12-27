package p19_12_2022;

import java.util.Scanner;

public class Zadatak10ZaVezbanje {

    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//        Primer izvrsenja:
//        Unesite broj: 32492
//        Novi broj je 29423

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();

//        String mirror = "";
//
//        for (int i = 0; i < 5; i++) {
//            int cifra = broj%10;
//            mirror = mirror + cifra;
//            broj=broj/10;
//        }
//        System.out.println("Novi broj je " + mirror);

//      varijanta 2, gde se ne pravi string
//        System.out.print("Novi broj je ");
//        for (int i = 1; i <=5; i++) {
//            int cifra = broj%10;
//            System.out.print(cifra);
//            broj=broj/10;
//        }

        //varijanta 3, gde se pravi novi broj
        int mirror = 0;

        for (int i = 0; i < 5; i++) {
            mirror=mirror*10+broj%10;
            broj=broj/10;
        }
        System.out.println("Novi broj je " + mirror);
    }
}
