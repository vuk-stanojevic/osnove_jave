package domaci_29_12_2022;

public class Zadatak3ZaVezbanje {
    public static void main(String[] args) {
//(ZA VEZBANJE) Kreirati klasu SmartAirConditioning koja ima:
//- atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//- atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//- atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//- atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//- atribut za mod (hladi/greje)
//- metodu za stampu - stampa u formatu
//          marka - mod - termperatura
//- metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//          30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//- metodu koja racuna koliko klima novca potrosi za mesec dana
//          - Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//          - Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//          - Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.setMarka("Samsung");
        samsung.setMod("hladi");
        samsung.setPotrosnjaHladi(1);
        samsung.setPotrosnjaGreje(2);
        samsung.setTemperatura(22);
        samsung.stampa();
        System.out.println("Mesecna potrosnja energije je " + samsung.mesecnaPotrosnjaEnergije() + " KW/h");
        System.out.println("Mesecna cena potrosnje je " + samsung.mesecnjaPotrosnjaCena() + " dinara");
        System.out.println();

        SmartAirConditioning galanz = new SmartAirConditioning();
        galanz.setMarka("Galanz");
        galanz.setMod("hladi");
        galanz.setPotrosnjaHladi(0.4);
        galanz.setPotrosnjaGreje(2.8);
        galanz.setTemperatura(11);
        galanz.stampa();
        System.out.println("Mesecna potrosnja energije je " + galanz.mesecnaPotrosnjaEnergije() + " KW/h");
        System.out.println("Mesecna cena potrosnje je " + galanz.mesecnjaPotrosnjaCena() + " dinara");
        System.out.println();

        SmartAirConditioning gree = new SmartAirConditioning();
        gree.setMarka("Gree");
        gree.setMod("greje");
        gree.setPotrosnjaHladi(2.1);
        gree.setPotrosnjaGreje(0.9);
        gree.setTemperatura(87);
        gree.stampa();
        System.out.println("Mesecna potrosnja energije je " + gree.mesecnaPotrosnjaEnergije() + " KW/h");
        System.out.println("Mesecna cena potrosnje je " + gree.mesecnjaPotrosnjaCena() + " dinara");
        System.out.println();

    }
}
