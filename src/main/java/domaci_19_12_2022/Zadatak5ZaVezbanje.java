package domaci_19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5ZaVezbanje {
    public static void main(String[] args) {

//        (Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//          Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se
//          prikazuju dva random broja koja treba da sabere i poruka o tacnosti resenja.
//          (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)
//          Random brojevi u Javi se generisisu kao u primeru
//          //creating an object of Random class
//          Random random = new Random();
//         // Generates random integers 0 to 49
//          int x = random.nextInt(50);
//          Koristan link, koristan video
//          Primer izvrsenja:
//          Koliko je 1 + 4? 5
//          Cestitam!
//          Koliko je 3 + 34? 23
//          Greska!
//          Koliko je 23 + 12? 45
//          Greska!
//          Koliko je 23 + 12? 24
//          Greska!
//          Koliko je 1+ 4? 5
//          Cestitam!

        Random random = new Random();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(51);
            int y = random.nextInt(51);
            System.out.print("Koliko je " + x + " + " + y + "? ");
            int rezultat = s.nextInt();
            if(rezultat==x+y){
                System.out.println("Cestitam!");
            } else {
                System.out.println("Greska!");
            }
        }
    }
}
