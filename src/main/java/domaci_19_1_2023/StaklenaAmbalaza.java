package domaci_19_1_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private int kaucijaIznos;
    private boolean kaucijaDaNe;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, int kaucijaIznos, boolean kaucijaDaNe, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.kaucijaIznos = kaucijaIznos;
        this.kaucijaDaNe = kaucijaDaNe;
        this.osnovnaCena = osnovnaCena;
    }

//    @Override
//    public double cena(){
//        if(this.kaucijaDaNe){
//            return this.osnovnaCena*1.2+this.kaucijaIznos;
//        } else {
//            return this.osnovnaCena*1.2;
//        }
//    }

    @Override
    public double cena(){
        return this.kaucijaDaNe ? this.osnovnaCena*1.2+this.kaucijaIznos : this.osnovnaCena*1.2;
    }

    @Override
    public void stampaj(){
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Neto masa: " + this.neto);
        System.out.println("Bruto masa: " + this.bruto);
        System.out.println("Tara masa: " + this.tara());
        System.out.println("Kaucija: " + this.kaucijaDaNe + ", " + this.kaucijaIznos);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
        System.out.println("Konacna cena: " + this.cena());
        System.out.println();
    }
}
