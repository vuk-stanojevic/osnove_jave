package p20_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        //Napisati program koji sabira brojeve koje korisnik unosi,
        //pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj = 0;

        while((suma + broj) <=100){
            suma = suma+broj;
            System.out.print("Unesite vrednost: ");
            broj = s.nextInt();
        }

        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".");
    }
}
