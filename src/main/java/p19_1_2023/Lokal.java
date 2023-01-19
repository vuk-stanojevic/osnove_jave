package p19_1_2023;

public class Lokal extends Objekat{
    public Lokal() {
    }

    public Lokal(String ulicaIBroj, double povrsina, int zona) {
        super(ulicaIBroj, povrsina, zona);
    }

    @Override
    public double porez(){
        return  this.koeficijent()*this.povrsina*1.3;
    }

    @Override
    public void stampaj(){
        System.out.println("Adresa: " + this.ulicaIBroj);
        System.out.println("Povrsina: " + this.povrsina + " m2");
        System.out.println("Zona: " + this.zona);
        System.out.println(this.porez());
        System.out.println();
    }
}
