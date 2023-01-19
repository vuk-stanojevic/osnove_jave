package p19_1_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//   1. Zadatak
//U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika)
// zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob

        ArrayList<Figura> figure = new ArrayList<>();

        Figura trougao1 = new JednakostranicniTrougao(7);
        Figura trougao2 = new JednakostranicniTrougao(8);

        figure.add(trougao1);
        figure.add(trougao2);

        Figura pravougaonik1 = new Pravougaonik(4, 7);
        Figura pravougaonik2 = new Pravougaonik(2, 9);
        Figura pravougaonik3 = new Pravougaonik(3, 22);

        figure.add(pravougaonik1);
        figure.add(pravougaonik2);
        figure.add(pravougaonik3);

        double svePovrsine = 0;
        double sviObimi = 0;

        for (int i = 0; i < figure.size(); i++) {
            svePovrsine += figure.get(i).povrsina();
        }

        for (int i = 0; i < figure.size(); i++) {
            sviObimi += figure.get(i).obim();
        }

        System.out.println("Zbir svih obima: " + sviObimi);
        System.out.println("Zbir svih povrsina: " + svePovrsine);
        System.out.println();

        for (int i = 0; i < figure.size(); i++) {
//            System.out.println("Obim ove figure je: " + figure.get(i).obim());
//            System.out.println("Povrsina ove figure je: " + figure.get(i).povrsina());
            figure.get(i).stampaj();
            System.out.println();
        }

    }
}
