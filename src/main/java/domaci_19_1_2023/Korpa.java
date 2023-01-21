package domaci_19_1_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarkod().equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    //nije bas najjasnije sta se u zadatku zapravo trazi od metode ispod i kakva ona treba da bude,
    // pogotovu zato sto je privatna pa nije jasno ni oko prosledjivanja parametra popusta
    private double cenaSvihAmbalazaSaPopustom(double popustProcenat){
        double cenaSvihAmbalazaSaPopustom = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaSvihAmbalazaSaPopustom += this.ambalaze.get(i).cena()*(100-popustProcenat)/100;
        }
        return cenaSvihAmbalazaSaPopustom;
    }

    //racunam ukupnu cenu korpe kao zbir obicnih cena ambalaze (bez popusta)
    public double cenaKorpe(SuperKartica superKartica){
        double cenaKorpe = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaKorpe += this.ambalaze.get(i).cena();
        }
        cenaKorpe -= superKartica.getPopust();
        return cenaKorpe;
    }

//    public double cenaKorpe(SuperKartica superKartica){
//        double cenaKorpe = 0;
//        cenaKorpe = cenaSvihAmbalazaSaPopustom()-superKartica.getPopust();
//        return cenaKorpe;
//    }

}
