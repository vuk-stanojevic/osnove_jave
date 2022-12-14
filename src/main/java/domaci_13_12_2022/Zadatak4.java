package domaci_13_12_2022;

public class Zadatak4 {

    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//        KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//        Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30
//
//        po povrsini i obimu vidimo da je u pitanju jednakostranicni trougao

        double stranica = 17.5;
        double korenOd3 = 1.73;

        double povrsina = (stranica*stranica*korenOd3)/4;
        double obim = 3*stranica;

        System.out.println("a: " + stranica);
        System.out.println("Povrsina je " + povrsina);
        System.out.println("Obim je " + obim);

    }
}
