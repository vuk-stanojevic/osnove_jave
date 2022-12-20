package p20_12_2022;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

//        Napisati program koji radi bipovanje ruznih reci.
//        Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec
//        sve dok se ne unese rec sa tackom. Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
//                Ruzne reci koje program prepoznaje su:
//        zajebava
//        mars
//        stoko
//        svinjo

//        Unesite rec: Jel
//                Jel
//        Unesite rec:ti
//                ti
//        Unesite rec:to
//                to
//        Unesite rec:mene
//                mene
//        Unesite rec:zajebavas
//                beeeeeeeeeep
//        Unesite rec:stoko
//                beeeeeeeeeep
//        Unesite rec:jedna.
//                jedna.
//                Kraj programa.

        Scanner s = new Scanner(System.in);

        String rec = "";

        while (!rec.contains(".")) {
            System.out.print("Unesite rec: ");
            rec = s.next();
//           po milanu: ispod je bolje contains umesto equals da bi se hvatao koren reci ili slicno
            if (rec.contains("zajebavas") || rec.contains("mars") || rec.contains("svinjo") ||  rec.contains("stoko")){
                System.out.println("beeeeeeeeeeeeep");
            } else {
                System.out.println(rec);
            }
        }
        System.out.println("Kraj programa");
    }
}

