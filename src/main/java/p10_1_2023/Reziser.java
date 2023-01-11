package p10_1_2023;

public class Reziser {
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god

    private String imePrezime;

    private int starost;

    private Film reziraoJe; //atribut tipa Film (referentni tip), ime mu je reziraoJe, pravi se veza sa klasom Film

    public void setReziraoJe(Film reziraoJe){
        this.reziraoJe = reziraoJe;
    }

    public Reziser(){

    }

    public Reziser(String imePrezime, int starost){
        this.imePrezime = imePrezime;
        this.starost = starost;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampajFilm(){
        System.out.println(this.imePrezime + ", " + this.starost + ", "
                + this.reziraoJe.getNaziv() + " godine " + this.reziraoJe.getGodina());
    }
}
