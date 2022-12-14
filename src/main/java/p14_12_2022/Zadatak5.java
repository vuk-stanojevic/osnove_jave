package p14_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//        Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
//                Primer izvrsenja:
//        Unesite b: 5
//        Uneiste c: 50
//        Unesite a: 15
//        A je u opstegu izmedju 5 i 50
//
//        Primer izvrsenja 2:
//        Unesite b: 5
//        Uneiste c: 50
//        Unesite a: 3
//        A nije u opstegu izmedju 5 i 50

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        double a = s.nextDouble();

        System.out.print("Unesite broj b: ");
        double b = s.nextDouble();

        System.out.print("Unesite broj c: ");
        double c = s.nextDouble();

        if (a>b && a<c) {
            System.out.println("a je u opsegu izmedju " + b + " i " + c);
        }else {
            System.out.println("a nije u opsegu izmedju " + b + " i " + c);
        }

        System.out.println("KRAJ");

    }
}
