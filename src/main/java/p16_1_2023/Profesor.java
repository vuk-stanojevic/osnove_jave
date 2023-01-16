package p16_1_2023;

public class Profesor extends Osoba{
    private String predmet;

    private double plata;

    public Profesor(String imeIPrezime, String jmbg, String predmet, int plata) {
        super(imeIPrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }

    public void povecajPlatu(double procenat){
        this.plata = this.plata * (1 + procenat/100);
    }

//    public void stampajProfu(){
//        super.stampaj();
//        System.out.println("Predmet: " + this.predmet);
//        System.out.println("Plata: " + this.plata);
//    }

    @Override
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg);
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }
}
