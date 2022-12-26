package p26_12_2022;

import java.util.Random;

public class Zadatak4 {
    public static void main(String[] args) {
        // Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva
        // prosledjena broja. Brojevi su ulazni parametri funkcije.
        // U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

        Random random = new Random();
        racunanja(7,2);
        racunanja(random.nextDouble()*100, random.nextDouble()*100);
    }
    public static void racunanja(double a, double b){
        System.out.println("Zbir a i b je: " + (a+b));
        System.out.println("Razlika a i b je: " + (a-b));
        System.out.println("Proizvod a i b je: " + (a*b));
        System.out.println("Kolicnik a i b je: " + (a/b));
    }
}
