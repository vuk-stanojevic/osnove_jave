package p17_1_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//   3. Zadatak
//Kreirati abstraktnu klasu Figura koja ima
//abstraktnu metodu povrsina
//abstraktnu metodu obim
//metodu koja stampa podatke u formatu:
//Povrsina je (povrsina)
//Obim je (obim)
//
//Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//stranicu a
//gettere/settere/konstruktore
//implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//implementira metodu obim
//
//Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//stranice a i b
//gettere/settere/konstruktore
//implementira metodu povrsina
//implementira metodu obim

        JednakostranicniTrougao trougao = new JednakostranicniTrougao(7);

        System.out.println(trougao.povrsina());
        System.out.println(trougao.obim());
        System.out.println();

        trougao.stampaj();
        System.out.println();

        Pravougaonik pravougaonik = new Pravougaonik(4, 7);

        System.out.println(pravougaonik.povrsina());
        System.out.println(pravougaonik.obim());
        System.out.println();

        pravougaonik.stampaj();
        System.out.println();

    }
}
