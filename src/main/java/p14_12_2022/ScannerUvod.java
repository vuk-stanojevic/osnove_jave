package p14_12_2022;

import java.util.Scanner;

public class ScannerUvod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost za a: ");
        int a = s.nextInt();

        System.out.print("Unesite vrednost za b: ");
        int b = s.nextInt();
        int sum = a + b;

        double x = s.nextDouble();

        System.out.println("Suma " + a + " + " + b + " = " + sum);
        System.out.println("Uneti double je: " + x);
    }
}
