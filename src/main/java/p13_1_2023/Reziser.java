package p13_1_2023;

import java.util.ArrayList;

public class Reziser {
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god

    private String imePrezime;

    private int starost;

    private ArrayList<Film> filmovi;

    public Reziser(String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
        this.filmovi = new ArrayList<>();
    }

    public Reziser() {
        this.filmovi = new ArrayList<>();
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public ArrayList<Film> getFilmovi() {
        return filmovi;
    }

    public void dodajFilm(Film film){
        this.filmovi.add(film);
    }

    public void dodajFilm(String nazivFilma, int godinaFilma){
        Film f = new Film(nazivFilma, godinaFilma);
        this.filmovi.add(f);
    }

    public void stampaj(){
        System.out.println("Reziser: " + this.imePrezime);
        System.out.println("Starost: " + this.starost);
        for (int i = 0; i < filmovi.size(); i++) {
            System.out.println(filmovi.get(i).getNaziv() + " (" + filmovi.get(i).getGodina() + ")");
        }
    }


    //    private Film reziraoJe; //atribut tipa Film (referentni tip), ime mu je reziraoJe, pravi se veza sa klasom Film
//
//    public void setReziraoJe(Film reziraoJe){
//        this.reziraoJe = reziraoJe;
//    }
//
//    public Reziser(){
//
//    }
//
//    public Reziser(String imePrezime, int starost){
//        this.imePrezime = imePrezime;
//        this.starost = starost;
//    }
//
//    public String getImePrezime() {
//        return imePrezime;
//    }
//
//    public int getStarost() {
//        return starost;
//    }
//
//    public void setImePrezime(String imePrezime) {
//        this.imePrezime = imePrezime;
//    }
//
//    public void setStarost(int starost) {
//        this.starost = starost;
//    }
//
//    public void stampajFilm(){
//        System.out.println(this.imePrezime + ", " + this.starost + ", "
//                + this.reziraoJe.getNaziv() + " godine " + this.reziraoJe.getGodina());
//    }
}
