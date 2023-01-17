package domaci_16_1_2023;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
        super();
    }

    public Igrac(String ime, String prezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
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
    }
}
