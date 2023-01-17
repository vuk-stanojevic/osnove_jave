package domaci_16_1_2023;

import java.util.ArrayList;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    private ArrayList<Karton> kartoni;

    public Igrac() {
        super();
    }

    public Igrac(String ime, String prezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
@Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Kapiten: " + this.kapiten);
        System.out.println("Broj zutih kartona: "+ this.brojZutih());
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih());
    }

    //Zadatak 2, za vezbanje


    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }

    public int brojZutih(){
        int counterZuti = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getKarton().equals("zuti")){
                counterZuti++;
            }
        }
        return counterZuti;
    }

    public int brojCrvenih(){
        int counterCrveni = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if(this.kartoni.get(i).getKarton().equals("crveni")){
                counterCrveni++;
            }
        }
        return counterCrveni;
    }
}
