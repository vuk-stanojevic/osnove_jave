package p19_1_2023;

public class Kuca extends Objekat{

    private int brojClanova;

    public Kuca() {
    }

    public Kuca(String ulicaIBroj, double povrsina, int zona, int brojClanova) {
        super(ulicaIBroj, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    @Override
    public double porez(){
        return this.koeficijent() * this.povrsina;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.ulicaIBroj);
        System.out.println("Povrsina: " + this.povrsina + " m2");
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj ljudi: " + this.brojClanova);
        System.out.println(this.porez());
        System.out.println();
    }
}
