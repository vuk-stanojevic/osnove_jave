package domaci_19_1_2023;

public class Alpinista extends Planinar{

    private int poeni;

    private int maksimalniUspon;

    private int clanarina;

    public Alpinista() {
    }

    public Alpinista(int identifikacioniBroj, String imeIPrezime, int poeni) {
        super(identifikacioniBroj, imeIPrezime);
        this.poeni = poeni;
        this.maksimalniUspon = 4000;
        this.clanarina = 1500;
    }

    public int getPoeni() {
        return poeni;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }

    public int getClanarina() {
        return clanarina;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj(){
        System.out.println("Alpinista, ID: " + this.identifikacioniBroj);
        System.out.println("Ime: " + this.imeIPrezime);
        System.out.println("Broj poena: " + this.poeni);
    }

    @Override
    public double clanarina(){
        if(this.clanarina-this.poeni*50<0){
            return 0;
        } else {
            return this.clanarina-this.poeni*50;
        }
    }

    @Override
    public boolean uspesanUspon(Planina planina){
        if(this.maksimalniUspon>=planina.getVisina()){
            return true;
        } else {
            return false;
        }
    }
}
