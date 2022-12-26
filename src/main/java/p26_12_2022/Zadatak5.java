package p26_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int unos = s.nextInt();
        System.out.print("Apsolutna vrednost tog broja je ");
        stampajApsolutnuVrednost(unos);
    }

    public static void stampajApsolutnuVrednost (int a){
        if(a>=0){
            System.out.println(a);
        }else{
            System.out.println(-1*a);
        }
    }
}
