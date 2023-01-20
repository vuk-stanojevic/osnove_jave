package p19_1_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Zadatak 4. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//ime i prezime privatni
//i rezultat ostvaren na takmičenju koji je zasticen
//Javne metode klase su:
//apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
//Kreirati i klasu Disciplina čiji su privatni atributi:
//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini.
//U javnom delu klase definisati:
//konstuktore, gettere i settere
//konstruktor koji postavlja ime discipline i tip
//metodu dodaj atleticara u disciplinu
//metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//(za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Atleticar trkac1 = new Trkac("Jusein Bolt", 9.65);
        Atleticar trkac2 = new Trkac("Tajson Gej", 10.12);
        Atleticar trkac3 = new Trkac("Brzi Gonzales", 8.2);

        Atleticar skakac1 = new Skakac("Ivana Spanovic", 7.45);
        Atleticar skakac2 = new Skakac("Ivana Vuleta", 7.52);
        Atleticar skakac3 = new Skakac("Majkl Dzordan", 10.2);

        Disciplina trkanjeNa110mSaPreponama = new Disciplina("110m sa preponama", "trkacka");
        trkanjeNa110mSaPreponama.dodajAtleticara(trkac1);
        trkanjeNa110mSaPreponama.dodajAtleticara(trkac2);
        trkanjeNa110mSaPreponama.dodajAtleticara(trkac3);

        Disciplina skokUDalj = new Disciplina("Skok u dalj", "skakacka");
        skokUDalj.dodajAtleticara(skakac1);
        skokUDalj.dodajAtleticara(skakac2);
        skokUDalj.dodajAtleticara(skakac3);

        trkac1.stampaj();
        trkac2.stampaj();
        trkac3.stampaj();
        skakac1.stampaj();
        skakac2.stampaj();
        skakac3.stampaj();
        System.out.println();

        System.out.println(trkac1.daLiJeBoljiOd(trkac2));
        System.out.println(trkac2.daLiJeBoljiOd(trkac3));
        System.out.println();

        System.out.println(skakac1.daLiJeBoljiOd(trkac2));
        System.out.println(skakac3.daLiJeBoljiOd(trkac1));
        System.out.println();

//        (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
        System.out.println("Najbolji trkac: " + trkanjeNa110mSaPreponama.nadjiNajboljeg().getImeIPrezime());
        System.out.println("Najbolji skakac: " + skokUDalj.nadjiNajboljeg().getImeIPrezime());
        System.out.println();

//    (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//    (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.
        System.out.print("Podaci najboljeg trkaca: ");
        trkanjeNa110mSaPreponama.podaciNajboljeg();
        System.out.print("Podaci najboljeg skakaca: ");
        skokUDalj.podaciNajboljeg();
        System.out.println();

        trkanjeNa110mSaPreponama.diskvalifikujAtleticara("Brzi Gonzales");
        System.out.println(trkanjeNa110mSaPreponama.getAtleticari());

        skokUDalj.diskvalifikujAtleticara("Majkl Dzordan");
        System.out.println(skokUDalj.getAtleticari());
        System.out.println();

        System.out.println("Ucesnici u disciplini " + trkanjeNa110mSaPreponama.getImeDiscipline() +
                ", tipa " + trkanjeNa110mSaPreponama.getTipDiscipline() + ":");
        for (int i = 0; i < trkanjeNa110mSaPreponama.getAtleticari().size(); i++) {
            trkanjeNa110mSaPreponama.getAtleticari().get(i).stampaj();
        }

        System.out.println("Ucesnici u disciplini " + skokUDalj.getImeDiscipline() + ", tipa " + skokUDalj.getTipDiscipline() + ":");
        for (int i = 0; i < skokUDalj.getAtleticari().size(); i++) {
            skokUDalj.getAtleticari().get(i).stampaj();
        }
        System.out.println();

        System.out.print("Podaci najboljeg trkaca nakon diskvalifikacije: ");
        trkanjeNa110mSaPreponama.podaciNajboljeg();
        System.out.print("Podaci najboljeg skakaca nakon diskvalifikacije: ");
        skokUDalj.podaciNajboljeg();
        System.out.println();

    }
}
