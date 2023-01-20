package p19_1_2023;

public abstract class Atleticar{
    private String imeIPrezime;

    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String imeIPrezime, double rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeBoljiOd(Atleticar atleticar);

    public void stampaj(){
        System.out.print(this.imeIPrezime + ", " + this.rezultat);
    }
}
