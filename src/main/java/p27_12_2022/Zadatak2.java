package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Krairti klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//[ime i prezime osobe] - [kad je poslata]
//[Tekst poruke]
//
//        Dopuna:
//        Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu koji je naveden iznad
//        i u mainu pozovite metode nad objektima koje ste kreirali.

        SlackMessage poruka1 = new SlackMessage();
        poruka1.imeIPrezime = "Vuk Stanojevic";
        poruka1.timestamp = "27.12.2022. 20:12:12";
        poruka1.tekst = "hello hello";
        System.out.println(poruka1.imeIPrezime + " - " + poruka1.timestamp);
        System.out.println(poruka1.tekst);

        SlackMessage poruka2 = new SlackMessage();
        poruka2.imeIPrezime = "Milan Jovanovic";
        poruka2.timestamp = "27.12.2022. 20:13:10";
        poruka2.tekst = "da, cujemo se";
        System.out.println(poruka2.imeIPrezime + " - " + poruka2.timestamp);
        System.out.println(poruka2.tekst);

        System.out.println();
        poruka1.stampajPoruku();
        poruka2.stampajPoruku();
    }
}
