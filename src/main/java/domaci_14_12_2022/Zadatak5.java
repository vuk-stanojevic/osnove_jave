package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//        (operator je string i moze imati vrednosti +, - , *, /) racuna i ispisuje na ekranu odgovarajuci zbir,
//        razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//        Primer 1:                                            Primer 2:
//        Unestite a: 6                                        Unestite a: 6
//        Unesite b: 3                                         Unesite b: 3
//        Unesite operator: +                                  Unesite operator: /
//        Rezultat: 9                                          Rezultat: 2

        //radjeno kao da se operacije uvek rade u redosledu prvo a pa b

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        double a = s.nextDouble();

        System.out.print("Unesite b: ");
        double b = s.nextDouble();

        double rezultat;

        System.out.print("Unesite operator (+, -, *, /): ");
        String operator = s.next();

        if(operator.equals("+")) {
            rezultat = a+b;
        } else if(operator.equals("-")) {
            rezultat = a-b;
        } else if(operator.equals("*")) {
            rezultat = a*b;
        } else {
            rezultat = a/b;
        }

        System.out.println("Rezultat: " + rezultat);

    }
}
