package p16_12_2022;

import java.util.Scanner;

public class Zadatak9ZaVezbanje {

    public static void main(String[] args) {
//        Napisati program koji iscrtava timeline na youtube videu.
//        Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, a program iscrtava timeline
//        tako sto deo koji je pogledan iscrtava zvezdicama a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//        (Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa
//        (zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
//*********-------------------------------------------------------------------------------------------
//
//        (DOPUNA TAKODJE ZA VEZBANJE)
//        Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//                *********-------------------------------------------------------------------------------------------
//                0:20 / 3:23


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa u sekundama: ");
        int duzina = s.nextInt();

        System.out.print("Unesite trenutno vreme videa u sekundama: ");
        int trenutno = s.nextInt();

        for (int i = 1; i <= 100; i++) {
            if(i<=((trenutno*100)/duzina)){
                System.out.print("*");
            }
            else System.out.print("-");
        }

        System.out.println();

        int duzinaMinut = duzina/60;
        int duzinaSekund = duzina%60;

        int trenutnoMinut = trenutno/60;
        int trenutnoSekund = trenutno%60;
        System.out.println(trenutnoMinut + ":" + trenutnoSekund + "/" + duzinaMinut + ":" + duzinaSekund);


    }
}
