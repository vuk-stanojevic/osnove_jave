package p10_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        1.Zad
//Za klasu Tacka, koja ima privatne atribute:
//x - x koordinata
//y - y koordinata
//Javne metode:
//metodu stampaj
//imamo difoltni konstruktor
//imamo konstuktor koji prima obe koordinate za kreiranje objekta
//geter za x
//geter za y
//seter za x
//seter za y
//
//U glavnom programu kreirati dva objekta:
//Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

        Tacka prva = new Tacka();

        prva.setX(10);
        prva.setY(20);

        prva.stampaj();

        Tacka druga = new Tacka(30, 40);
        druga.stampaj();

    }
}
