package domaci_14_12_2022;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

//        Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//        T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//
//        Primer izvrsenja 1:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 50
//        Unesite y za M: 50
//        Kliknuto je unutar forme
//
//        Primer izvrsenja 2:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 120
//        Unesite y za M: 50
//        Nije kliknuto je unutar forme

        // uradjeno kao da je x osa horizontalna i raste na desno, a y vertikalna i raste na gore, kao sto se uvek
        // radilo u skoli, tako da je ovo u prvom kvadrantu tj. koordinatni pocetak je u njegovom donjem levom uglu

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x koordinatu za T1: ");
        int t1x = s.nextInt();

        System.out.print("Unesite y koordinatu za T1: ");
        int t1y = s.nextInt();

        System.out.print("Unesite x koordinatu za T2: ");
        int t2x = s.nextInt();

        System.out.print("Unesite y koordinatu za T2: ");
        int t2y = s.nextInt();

        System.out.print("Unesite x koordinatu za M: ");
        int mx = s.nextInt();

        System.out.print("Unesite y koordinatu za M: ");
        int my = s.nextInt();

        if(mx>=t1x && mx<=t2x && my<=t1y && my>=t2y) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto unutar forme");
        }


    }
}
