package p13_1_2023;

import java.util.concurrent.RecursiveAction;

public class Zadatak2 {
    public static void main(String[] args) {
// 2. Zadatak
//	Kreirati klasu Reakcija koja ima
//tip reakcije (smajli, like, srce)
//ime i prezime korisnika koji je reagovao
//gettere, settere i konstruktore
//
//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.
//privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//brojReakcija(“smajli) => 3
//brojReakcija(“srce”) => 2
//brojReakcija(“like”) => 1
//brojReakcija(“cry”) => 0
//
//
//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2

        Reakcija prva = new Reakcija("srce", "Milan");
        Reakcija druga = new Reakcija("srce", "Jovan");
        Reakcija treca = new Reakcija("like", "Marija");
        Reakcija cetvrta = new Reakcija("smajli", "Janko");
        Reakcija peta = new Reakcija("smajli", "Nikola");
        Reakcija sesta = new Reakcija("smajli", "Ljubica");

        FacebookPost prvi = new FacebookPost("Milan Jovanovic", "neka forica blablablabla");
        prvi.reaguj(prva);
        prvi.reaguj(druga);
        prvi.reaguj(treca);
        prvi.reaguj(cetvrta);
        prvi.reaguj(peta);
        prvi.reaguj(sesta);

        prvi.stampaj();
    }
}
