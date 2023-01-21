package domaci_19_1_2023;

public abstract class Planinar {
    protected int identifikacioniBroj;
    protected String imeIPrezime;

    public Planinar() {
    }

    public Planinar(int identifikacioniBroj, String imeIPrezime) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.imeIPrezime = imeIPrezime;
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

}
