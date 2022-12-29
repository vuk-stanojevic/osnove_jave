package p29_12_2022;

public class Auto {
    public String imeIPrezime;

    public String marka;

    public int vrata;

    public double potrosnjaFabricka;

    public int brzina;

    public boolean otvorenGepek;

    public String brojRegistracije;

    public boolean klimaUkljucena;

    public void stampa() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " " + this.vrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaFabricka + " l na 100 km");
        System.out.println(this.brzina + "km/h je trenutna brzina.");
    }
//    (Dopuna)
//    U okviru klase Auto, implementirati jos 2 metode:
//    metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//    Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//    ako je trenutna brzina veca od ogranicenja.
//    metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
//    Metoda od parametara prima ogranicenje brzine
//    U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.

    public boolean prekoracioDaNe(int ogranicenje) {
        if (this.brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje) {
        int kazna = 0;
        if (this.brzina > ogranicenje) {
            return kazna = (this.brzina - ogranicenje) * 1000;
        } else {
            return kazna;
        }
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

    public int godinaProizvodnje;

    public int mesecRegistracije;

    public int kubikaza;

    public boolean oldtimer() {
        if (this.godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isteklaRegistracija(int trenutniMesec) {
        if (this.mesecRegistracije < trenutniMesec) {
            return true;
        } else {
            return false;
        }
    }

    public double cenaRegistracije() {
        if (this.kubikaza <= 2000) {
            return this.kubikaza * 100;
        } else {
            return (this.kubikaza * 100) * 1.3;
        }
    }

    public void otvoriGepek() {
        this.otvorenGepek = true;
    }

//    (Dopuna 3)
//Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

    public void dodajGas() {
        this.brzina = this.brzina + 10;
        if (this.brzina + 10 > this.maksimalnaBrzina) {
            this.brzina = this.maksimalnaBrzina;
        }
    }

    public void koci() {
        this.brzina = this.brzina - 10;
        if (this.brzina < 0) {
            this.brzina = 0;
        }
    }

    public double potrosnjaKlima() {
        if (this.klimaUkljucena) {
            return this.brzina / 100.0 * this.potrosnjaFabricka * 1.2;
        } else {
            return this.brzina / 100.0 * this.potrosnjaFabricka;
        }
    }

//    (Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa
//  |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

    public int maksimalnaBrzina;

    public void stampajTablu() {
       for (int i = 1; i <=100; i++) {
            if (i <= ((this.brzina * 100) / this.maksimalnaBrzina)) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(this.brzina + "/" + this.maksimalnaBrzina + "km/h");
    }

//    (Dopuna 5)
//Dopuniti klasu Auto tako da ima:
//kapacitet rezervoara
//trenutnu kolicinu goriva u rezervoaru (u litrima)
//metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva.
// Litar goriva je 210din.. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
// takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.

    public double kapacitetRezervoara;

    public double trenutnoRezervoar;

    public double natociGorivo(double kolikoSeToci){
        if(kolikoSeToci > kapacitetRezervoara - trenutnoRezervoar){
            kolikoSeToci = kapacitetRezervoara - trenutnoRezervoar;
        }
        return kolikoSeToci*210;
    }

}

