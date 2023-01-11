package p10_1_2023;

public class Tacka {
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

    private int x;

    private int y;

    public void stampaj(){
        System.out.println("Koordinate ove tacke su: (" + this.x + ", " + this.y + ")");
    }

    public Tacka(){

    }

    public Tacka(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
