package domaci_19_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//1.Zadatak
//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
//
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
//
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
//
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
// se prima Super karticu iz koje se cita popust.
//
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova
// i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa potrosacka = new Korpa();

        Ambalaza sokOdNarandze = new Tetrapak("6666-6666", "Next Narandza 1l", 1000, 1080, true, 150);
        Ambalaza mleko = new Tetrapak("987455-121", "Mleko 0.5l", 500, 540, false, 85);
        Ambalaza paradajz = new Tetrapak("1234-5678", "Paradajz za kuvanje 0.5l", 650, 690, true, 80);

        Ambalaza pivo = new StaklenaAmbalaza("777-7777", "Zajecarsko 0.5l", 500, 830, 25, true, 60);
        Ambalaza ajvar = new StaklenaAmbalaza("44444-4444", "Ajvar 720ml", 850, 1000, 0, false, 250);
        Ambalaza humus = new StaklenaAmbalaza("111111-1111", "Humus 180g", 180, 250, 0, false, 170);

        SuperKartica kartica = new SuperKartica(121212, "Marko Markovic", 500);

        potrosacka.dodajAmbalazu(sokOdNarandze);
        potrosacka.dodajAmbalazu(sokOdNarandze);
        potrosacka.dodajAmbalazu(mleko);
        potrosacka.dodajAmbalazu(paradajz);
        potrosacka.dodajAmbalazu(pivo);
        potrosacka.dodajAmbalazu(pivo);
        potrosacka.dodajAmbalazu(ajvar);
        potrosacka.dodajAmbalazu(humus);

        System.out.println(sokOdNarandze.cena());
        sokOdNarandze.stampaj();

        System.out.println(mleko.cena());
        mleko.stampaj();

        System.out.println(paradajz.cena());
        paradajz.stampaj();

        System.out.println(pivo.cena());
        pivo.stampaj();

        System.out.println(ajvar.cena());
        ajvar.stampaj();

        System.out.println(humus.cena());
        humus.stampaj();

        System.out.print("Skenirana Super Kartica: ");
        kartica.stampaj();

//        System.out.println("Cena korpe nakon popusta sa Super Kartice: " + potrosacka.cenaKorpe(kartica));
        System.out.println("Cena korpe nakon popusta sa Super Kartice: " + potrosacka.cenaKorpe(kartica, 10));

        System.out.println("Zelite da vratite jedan sok od narandze? Nema problema!");
        potrosacka.izbaciAmbalazu("6666-6666");

//        System.out.println("Cena korpe nakon popusta sa Super Kartice: " + potrosacka.cenaKorpe(kartica));
        System.out.println("Cena korpe nakon popusta sa Super Kartice: " + potrosacka.cenaKorpe(kartica, 10));
    }
}
