package domaci_12_1_2023;

public class Ringla {
    private String tip;
    private int jacina;
    private double jacinaGrejacaKW;

    public Ringla(String tip, double jacinaGrejacaKW) {
        this.tip = tip;
        this.jacinaGrejacaKW = jacinaGrejacaKW;
        this.jacina = 0;
    }

    public int getJacina() {
        return jacina;
    }

    private int maksimalanBrojPojacanja(){
        if(this.tip.equals("obicna")){
            return 3;
        } else {
            return 12;
        }
    }

    public void pojacajRinglu(){
        if(this.jacina + 1 < maksimalanBrojPojacanja()) {
            this.jacina = this.jacina + 1;
        }
    }

    public void iskljuciRinglu(){
        this.jacina = 0;
    }

    public String ukljIsklj(){
        if(this.jacina==0){
            return "Iskljucena";
        } else {
            return "Ukljucena";
        }
    }

    public double potrosnja(double vreme){
        return (100/maksimalanBrojPojacanja()*this.jacina*this.jacinaGrejacaKW*vreme);
    }

    public void stampaj(){
       if(this.jacina==0){
           System.out.println("Ringla je iskljucena");
       } else {
           System.out.println("Ringla je ukljucena");
       }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejacaKW);
    }
}
