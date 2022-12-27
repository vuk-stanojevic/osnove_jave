package p27_12_2022;

public class Zadatak3 {
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
        milan.potrosnja = 10.0;
        milan.brzina = 200;

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
    }
}
