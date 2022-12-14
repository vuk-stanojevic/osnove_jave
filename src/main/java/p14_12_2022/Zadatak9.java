package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
//        Korisnik unosi akciju sa tastature. Jednu od sledecih:
//        pojacaj - pojacava zvuk za 10
//        smanji - smanjuje zvuk za 10.
//        mute - postavlja zvuk na 0.
//        Na kraju programa odstampati jacinu zvuka
//        Primer izvrsenja 1:
//        Jacina zvuka je 75.
//        Unesite akciju: pojacaj
//        Nova jacina zvuka je 85

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite pocetnu jacinu zvuka: ");
        int jacina = s.nextInt();

        System.out.print("Jacina zvuka je 75. Unesite akciju: ");
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

        // korekcija kad se desi greska - kad je jacina zvuka manja od minimuma (0) ili veca od maksimuma (100)
        if(jacina<0){
            jacina=0;
        }else if(jacina>100){
            jacina = 100;
        }

        System.out.println("Nova jacina zvuka je " + jacina);
    }
}
