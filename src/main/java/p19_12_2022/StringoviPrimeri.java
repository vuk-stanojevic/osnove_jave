package p19_12_2022;

import java.util.Scanner;

public class StringoviPrimeri {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Unesite tekst: ");
        String x = s.next();

        System.out.println(x.length());

        String demo = "Neki demo tekst";

        if (demo.contains("Neki")) {
            System.out.println("Sadrzi");
        } else {
            System.out.println("Ne sadrzi");
        }
    }
}
