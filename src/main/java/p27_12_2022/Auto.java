package p27_12_2022;

public class Auto {
    public String imeIPrezime;

    public String marka;

    public int vrata;

    public double potrosnja;

    public int brzina;

    public void stampa(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " " + this.vrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100 km");
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

    public boolean prekoracioDaNe(int ogranicenje){
        if(this.brzina>ogranicenje){
            return true;
        }else{
            return false;
        }
    }

    public int kazna(int ogranicenje){
        int kazna = 0;
        if(this.brzina>ogranicenje){
            return kazna = (this.brzina-ogranicenje)*1000;
        }else{
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

    public boolean oldtimer () {
        if (this.godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isteklaRegistracija (int trenutniMesec){
        if(this.mesecRegistracije<trenutniMesec){
            return true;
        }else{
            return false;
        }
    }

    public double cenaRegistracije(){
        if(this.kubikaza<=2000){
            return this.kubikaza*100;
        }else{
            return (this.kubikaza*100)*1.3;
        }
    }

}
