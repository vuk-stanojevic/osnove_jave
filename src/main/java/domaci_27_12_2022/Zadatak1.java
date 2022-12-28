package domaci_27_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
// a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Scanner s = new Scanner(System.in);

        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Menaz";
        cokolada.cena = 140;
        cokolada.masaGrami = 100;

        cokolada.stampaj();
        System.out.print("Unesite jedinicu u koju zelite da konvertujete masu (kg, t): ");
        String jedinica = s.next();
        System.out.print("Masa u " + jedinica + " je " + cokolada.konvertuj(jedinica));
        System.out.println();

        Proizvod brasno = new Proizvod();
        brasno.naziv = "Fidelinka";
        brasno.cena = 320;
        brasno.masaGrami = 5000;

        brasno.stampaj();
        System.out.print("Unesite jedinicu u koju zelite da konvertujete masu (kg, t): ");
        jedinica = s.next();
        System.out.print("Masa u " + jedinica + " je " + brasno.konvertuj(jedinica));
        System.out.println();

        Proizvod ugalj = new Proizvod();
        ugalj.naziv = "Kostolac";
        ugalj.cena = 15000;
        ugalj.masaGrami = 1000000;

        ugalj.stampaj();
        System.out.println("Unesite jedinicu u koju zelite da konvertujete masu (kg, t): ");
        jedinica = s.next();
        System.out.print("Masa u " + jedinica + " je " + ugalj.konvertuj(jedinica));
        System.out.println();
    }
}
