package p16_1_2023;

public class Student extends Osoba{
    private int indeks;

    private int dugZaSkolarinu;

    public Student(String imeIPrezime, String jmbg, int indeks, int dugZaSkolarinu) {
        super(imeIPrezime, jmbg);
        this.indeks = indeks;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void uplatiSkolarinu(int uplata){
        this.dugZaSkolarinu = this.dugZaSkolarinu - uplata;
    }

//    public void stampajStudenta(){
//        super.stampaj();
//        System.out.println("Broj indeksa: " + this.indeks);
//        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);
//    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj indeksa: " + this.indeks);
        System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);
    }
}
