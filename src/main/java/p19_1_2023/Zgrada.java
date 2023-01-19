package p19_1_2023;

public class Zgrada extends Objekat{
    private int brojStanova;

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada() {
    }

    public Zgrada(String ulicaIBroj, double povrsina, int zona, int brojStanova) {
        super(ulicaIBroj, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez(){
       return this.koeficijent()*this.povrsina*this.brojStanova;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.ulicaIBroj);
        System.out.println("Povrsina: " + this.povrsina + " m2");
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println(this.porez());
        System.out.println();
    }

}
