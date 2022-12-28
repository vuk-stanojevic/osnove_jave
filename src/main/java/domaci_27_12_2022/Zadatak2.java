package domaci_27_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite spoljasnju temperaturu: ");
        int spoljasnjaTemperatura = s.nextInt();
        System.out.println();

        SmartAirConditioning prviSprat = new SmartAirConditioning();
        prviSprat.marka = "Midea";
        prviSprat.izabranaTemperatura = 17;
        prviSprat.mod = "greje";
        prviSprat.stampaj();
        if(prviSprat.napoljuVece(spoljasnjaTemperatura)){
            System.out.println("Napolju je veca temperatura od one na koju je klima postavljena.");
        }else{
            System.out.println("Napolju je manja temperatura od one na koju je klima postavljena.");
        }
        System.out.println();

        SmartAirConditioning drugiSprat = new SmartAirConditioning();
        drugiSprat.marka = "Samsung";
        drugiSprat.izabranaTemperatura = 23;
        drugiSprat.mod = "hladi";
        drugiSprat.stampaj();
        if(drugiSprat.napoljuVece(spoljasnjaTemperatura)){
            System.out.println("Napolju je veca temperatura od one na koju je klima postavljena.");
        }else{
            System.out.println("Napolju je manja temperatura od one na koju je klima postavljena.");
        }
        System.out.println();

        SmartAirConditioning potkrovlje = new SmartAirConditioning();
        potkrovlje.marka = "LG";
        potkrovlje.izabranaTemperatura = 25;
        potkrovlje.mod = "hladi";
        potkrovlje.stampaj();
        if(potkrovlje.napoljuVece(spoljasnjaTemperatura)){
            System.out.println("Napolju je veca temperatura od one na koju je klima postavljena.");
        }else{
            System.out.println("Napolju je manja temperatura od one na koju je klima postavljena.");
        }
        System.out.println();

    }
}
