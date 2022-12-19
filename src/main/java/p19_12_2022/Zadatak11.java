package p19_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
//        Napisati program koji uneti password sakriva.
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite password: ");
        String password = s.nextLine();

        int duzina = password.length();

        System.out.print("Skriveni password: ");

        for (int i = 1; i <=duzina; i++) {
            System.out.print("*");
        }
    }
}
