package domaci_19_1_2023;

public class SuperKartica {

    private int broj;
    private String vlasnik;
    private int popust;

    public SuperKartica() {
    }

    public SuperKartica(int broj, String vlasnik, int popust) {
        this.broj = broj;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println(this.broj + ", " + this.vlasnik);
    }
}
