package p26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.
//        stampajIme();
//        stampajIme();
//        stampajIme();
//        stampajIme();
//        stampajIme();

        for (int i = 0; i < 5; i++) {
            stampajIme();
        }

    }

    public static void stampajIme(){
        System.out.println("Vuk Stanojevic");
    }
}
