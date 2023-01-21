package domaci_19_1_2023;

public class Tetrapak extends Ambalaza{

    private boolean recikliraSe;
    private double osnovnaCena;

    public boolean isRecikliraSe() {
        return recikliraSe;
    }
    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak() {
    }

    public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean recikliraSe, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena(){
        if(this.recikliraSe){
            return this.tara()*1.5+this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj(){
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Neto masa: " + this.neto);
        System.out.println("Bruto masa: " + this.bruto);
        System.out.println("Tara masa: " + this.tara());
        System.out.println("Reciklira se: " + this.recikliraSe);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Konacna cena: " + this.cena());
        System.out.println();
    }
}
