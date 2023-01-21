package domaci_19_1_2023;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int osnovanGodina;
    private ArrayList<Planinar> clanovi;

    public PlaninarskiDom() {
        this.clanovi = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int osnovanGodina) {
        this.naziv = naziv;
        this.osnovanGodina = osnovanGodina;
        this.clanovi = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOsnovanGodina() {
        return osnovanGodina;
    }

    public void setOsnovanGodina(int osnovanGodina) {
        this.osnovanGodina = osnovanGodina;
    }

    public ArrayList<Planinar> getClanovi() {
        return clanovi;
    }

    public void uclaniPlaninara(Planinar planinar){
        this.clanovi.add(planinar);
    }
    //ako se pod "broj planinara" misli na to koliko ce se ukupno planinara popeti, a ne na njihove ID brojeve:
    public int popeliSe(Planina planina){
        int popeliSe = 0;
        for (int i = 0; i < this.clanovi.size(); i++) {
            if(this.clanovi.get(i).uspesanUspon(planina)){
                popeliSe++;
            }
        }
        return popeliSe;
    }

    public void izbaciPlaninara(int id){
        for (int i = 0; i < this.clanovi.size(); i++) {
            if(this.clanovi.get(i).getIdentifikacioniBroj()==id){
                this.clanovi.remove(i);
            }
        }
    }

    public void stampaj(){
        System.out.println("Naziv: " + this.naziv);
        System.out.println("Osnovan: " + this.osnovanGodina + ".");
        System.out.println("Clanovi: ");
        for (int i = 0; i < this.clanovi.size(); i++) {
            this.clanovi.get(i).stampaj();
        }
    }

    public double prihod(){
        double prihod = 0;
        for (int i = 0; i < this.clanovi.size(); i++) {
            prihod += this.clanovi.get(i).clanarina();
        }
        return prihod;
    }
}
