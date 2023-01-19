package p19_1_2023;

public abstract class Atleticar{
    private String imeIPrezime;
    private String prezime;
    protected int rezultat;

    public Atleticar() {
    }

    public Atleticar(String imeIPrezime, int rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getRezultat() {
        return rezultat;
    }

    public void setRezultat(int rezultat) {
        this.rezultat = rezultat;
    }

    public abstract boolean (Atleticar atleticar);

    public void stampaj(){
        System.out.println("Ime i prezime: " + this.imeIPrezime + " " + this.prezime + ", " + this.rezultat);
    }
}
