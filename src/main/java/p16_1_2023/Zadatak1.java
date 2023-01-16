package p16_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
// 1. Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//			U glavnom programu kreirati 2 studenta i 2 profesora.

        Student brucos = new Student("Marko Markovic", "13212313213", 44444, 50000);
        Student apsolvent = new Student("Aleksandra Aleksandric", "454545454545", 3333, 20000);

        Profesor prvi = new Profesor("Matori Profesor", "11111111111", "fizika", 80000);
        Profesor druga = new Profesor("Mlada Profesorka", "8787878778", "sociologija", 80000);

        brucos.uplatiSkolarinu(4500);
//        brucos.stampajStudenta();
        System.out.println();
        apsolvent.uplatiSkolarinu(1000);
//        apsolvent.stampajStudenta();
        System.out.println();

        prvi.povecajPlatu(15);
//        prvi.stampajProfu();
        System.out.println();
        druga.povecajPlatu(10);
//        druga.stampajProfu();
        System.out.println();

//        (dopuna)
//	Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu

        brucos.stampaj();
        apsolvent.stampaj();
        System.out.println();

        prvi.stampaj();
        druga.stampaj();
    }
}
