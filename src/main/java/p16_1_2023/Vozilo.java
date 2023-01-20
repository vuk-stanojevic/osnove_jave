package p16_01_2023;

public abstract class Vozilo {
    protected String registracija;
    protected String marka;
    protected int brzina;
    protected int kubikaza;
    protected int maxBrzina;

    public Vozilo() {
        System.out.println("Konstuktor iz Vozilo klase.");

    }

    public Vozilo(String registracija, String marka,
                  int brzina, int kubikaza, int maxBrzina) {
        this.registracija = registracija;
        this.marka = marka;
        this.brzina = brzina;
        this.kubikaza = kubikaza;
        this.maxBrzina = maxBrzina;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getMaxBrzina() {
        return maxBrzina;
    }

    public void setMaxBrzina(int maxBrzina) {
        this.maxBrzina = maxBrzina;
    }

    public void stampajBasic() {
        System.out.println("Registracija: " + this.registracija);
        System.out.println("Brzina: " + this.brzina);
        System.out.println("Marka " + this.marka);
        System.out.println("Kubikaza " + this.kubikaza);
    }
}
