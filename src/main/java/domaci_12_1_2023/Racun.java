package domaci_12_1_2023;

public class Racun {
    private String broj;
    private String imePrezime;
    private double stanje;

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getStanje() {
        return stanje;
    }

    public void promena(double vrednost){
        if(this.stanje+vrednost<0){
            System.out.println("Na racunu nema dovoljno sredstava za transakciju");
        } else {
            this.stanje = this.stanje + vrednost;
        }
    }

    public void stampaj(){
        System.out.println(this.imePrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
    }

    public Racun(String broj, String imePrezime, double stanje) {
        this.broj = broj;
        this.imePrezime = imePrezime;
        this.stanje = stanje;
    }
}
