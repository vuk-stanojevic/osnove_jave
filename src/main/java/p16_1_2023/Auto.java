package p16_01_2023;

public class Auto extends Vozilo {
    private int brojSedista;
    public Auto() {

    }

    public void stampaj() {
        System.out.println("Auto:");
        this.stampajBasic();
//        super.stampajBasic();

        System.out.println("Broj sedista: " + this.brojSedista);
    }
}
