package domaci_19_1_2023;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maksimalniUsponBezOpreme;
    private int clanarina;

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(int identifikacioniBroj, String imeIPrezime, int tezinaOpreme, String okrug, int maksimalniUsponBezOpreme) {
        super(identifikacioniBroj, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maksimalniUsponBezOpreme = maksimalniUsponBezOpreme;
        this.clanarina = 1000;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public int getMaksimalniUsponBezOpreme() {
        return maksimalniUsponBezOpreme;
    }

    public int getClanarina() {
        return clanarina;
    }

    @Override
    public void stampaj(){
        System.out.println("Rekreativac, ID: " + this.identifikacioniBroj);
        System.out.println("Ime: " + this.imeIPrezime);
        System.out.println("Okrug: " + this.okrug);
    }

    @Override
    public double clanarina(){
        return this.clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina){
        if(this.maksimalniUsponBezOpreme-this.tezinaOpreme*50>=planina.getVisina()){
            return true;
        } else {
            return false;
        }
    }
}
