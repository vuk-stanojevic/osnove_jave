package p16_01_2023;

public class Kamion extends Vozilo {

    private int nosivost;

    public Kamion() {
        super(); // ovo je poziv konstuktora iz osnovne klase

        System.out.println("Konstuktor iz Kamion klase.");
    }

    public Kamion(String registracija, String marka, int brzina,
                  int maxBrzina, int kubikaza, int nosivost) {
        super(registracija, marka, brzina, kubikaza, maxBrzina);

        this.nosivost= nosivost;
    }

    public void stampaj() {
        System.out.println("Kamion:");
        this.stampajBasic();
        System.out.println("Nosivost: " + this.nosivost);
    }
}
