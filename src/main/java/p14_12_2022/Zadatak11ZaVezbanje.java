package p14_12_2022;

import java.util.Scanner;

public class Zadatak11ZaVezbanje {
    public static void main(String[] args) {
//        (za vezbanje)
//        Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
//        Korisnik unosi 5 akcija. Jednu od sledecih:
//        pojacaj - pojacava zvuka za 10
//        smanji - smanjuje zvuk za 10.
//        mute - postavlja zvuk na 0.
//        Na kraju programa odstampati jacinu zvuka.
//        NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti da padne ispod 0.
//
//        Primer izvrsenja:
//        Unesite akciju: pojacaj (objasnjenj: nakon ovoga je 85)
//        Unesit akciju: pojacaj (objasnjenje: nakon ovoga je 95)
//        Unesite akciju: pojacaj (objasnjeje: nakon ovoga je 100, jer ne moze da bude 105)
//        Unesit akciju: mute (ovjasnjenje: nakon ovoga je 0)
//        Unesit akciju: smanji (objasnjenje: nakon ovoga ostaje 0)
//        Jacina zvuka je 0.

        Scanner s = new Scanner(System.in);

        int jacina = 75;

        System.out.print("Jacina zvuka je " + jacina + ". ");

        for (int i = 1; i <=5 ; i++) {

            System.out.print("Unesite akciju (pojacaj, smanji, mute): ");
            String unos = s.next();

            if (unos.equals("pojacaj")) {
                jacina = jacina + 10;
            } else if (unos.equals("smanji")) {
                jacina = jacina - 10;
            } else if (unos.equals("mute")) {
                jacina = 0;
            } else {
                System.out.println("Nepoznata akcija");
            }
            if (jacina < 0) {
                jacina = 0;
            } else if (jacina > 100) {
                jacina = 100;
            }
        }

        System.out.println("Nova jacina zvuka je " + jacina);
    }
}
