package p16_1_2023;

public class Osoba {
    protected String imeIPrezime;

    protected String jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg);
    }
}
