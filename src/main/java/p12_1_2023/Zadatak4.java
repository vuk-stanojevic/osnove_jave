package p12_1_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//4. Zadatak
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
// Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

        ArrayList<Sastojak> sastojci = new ArrayList<>();

        Sastojak a = new Sastojak("cokolada", 178);
        Sastojak b = new Sastojak("narandze", 99);
        Sastojak c = new Sastojak("brasno", 75);

        sastojci.add(a);
        sastojci.add(b);
        sastojci.add(c);

        for (int i = 0; i < sastojci.size(); i++) {
            System.out.println(sastojci.get(i).getNaziv() + " " + sastojci.get(i).getCena());
        }

    }
}
