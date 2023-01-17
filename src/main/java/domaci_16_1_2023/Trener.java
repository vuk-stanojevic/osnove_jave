package domaci_16_1_2023;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;

    public Trener(String ime, String prezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public Trener() {
        super();
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
    }
}
