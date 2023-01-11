package p10_1_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
//        Napravite vezu izmedju objekata i pozovite metode.

        Film prvi = new Film();
        prvi.setNaziv("Otpisani");
        prvi.setGodina(1974);
//        prvi.setReziraoGaJe(reziser);


        Reziser reziser = new Reziser();
        reziser.setImePrezime("Aleksandar Djordjevic");
        reziser.setStarost(55);
        reziser.setReziraoJe(prvi); //ovim pravimo vezu izmedju objekata

        prvi.stampajFilm();
        reziser.stampajFilm();

        System.out.println(prvi); //stampa adresu

    }
}
