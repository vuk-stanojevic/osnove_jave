package p29_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//Kreirati klasu Auto koja ima:
//ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
//metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//
//Primer:
//	Milan Jovanovic
//	BMW - 5-ro vrata
//	Sa potrosnjom od 10 l na 100km
//	200 km/h je trenutna brzina

        Auto milan = new Auto();
        milan.imeIPrezime = "Milan Jovanovic";
        milan.marka = "BMW";
        milan.vrata = 5;
        milan.potrosnjaFabricka = 10.0;
        milan.brzina = 180;

        milan.stampa();

//    (Dopuna)
//    U okviru klase Auto, implementirati jos 2 metode:
//    - metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//    Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//    ako je trenutna brzina veca od ogranicenja.
//    - metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
//    Metoda od parametara prima ogranicenje brzine
//    U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

        int ogranicenje = 50;

        if(milan.prekoracioDaNe(ogranicenje)==true){
            System.out.println("Prekoracena je brzina!");
            System.out.println("Kolika je kazna? " + milan.kazna(ogranicenje));
        }else{
            System.out.println("Nije prekoracena brzina.");
        }

//    (Dopuna 2)
//Dopuniti klasu Auto tako da ima:
//- atribut godinu proizvodnje
//- atribut mesec do kad je registrovan auto (int)
//- atribut kubikaza auta (npr: 1600 - 5000)
//- metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//- metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec
// i na osnovu toga vraca true ili false.
//- metodu koja racuna i vraca cenu registracije za auto.Za automobile do 2000 kubika cena registracije kubikaza * 100din,
// za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

        int trenutniMesec = 12;

        milan.godinaProizvodnje = 2012;
        milan.mesecRegistracije = 11;
        milan.kubikaza = 3400;

        if(milan.isteklaRegistracija(trenutniMesec)){
            System.out.println("Auto je i dalje registrovan");
        }else{
            System.out.println("Istekla je registracija!");
        }

        if(milan.oldtimer()){
            System.out.println("Awwwww, auto je oldtimer!");
        }
        System.out.println("Cena registracije je " + milan.cenaRegistracije());

        milan.otvoriGepek();

//        (Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

        milan.klimaUkljucena = true;
        milan.brojRegistracije = "NI-123-AB";

        System.out.println(milan.brzina);
        milan.dodajGas();
        milan.koci();
        milan.koci();
        System.out.println(milan.brzina);


        System.out.println(milan.potrosnjaFabricka);
        System.out.println(milan.potrosnjaKlima());
//(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

        milan.maksimalnaBrzina = 240;
        milan.brzina = 150;

        milan.stampajTablu();
        System.out.println();
        System.out.println();


//        //    (Dopuna 5)
////Dopuniti klasu Auto tako da ima:
////kapacitet rezervoara
////trenutnu kolicinu goriva u rezervoaru (u litrima)
////metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
//// Litar goriva je 210din.. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
//// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.

        milan.kapacitetRezervoara = 50;
        milan.trenutnoRezervoar = 34.2;

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite koliko litara goriva zelite da natocite: ");
        double kolikoSeToci = s.nextDouble();

        System.out.println("Cena natocenog goriva je " + milan.natociGorivo(kolikoSeToci));

    }
}
