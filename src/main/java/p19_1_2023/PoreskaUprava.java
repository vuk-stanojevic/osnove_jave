package p19_1_2023;

import java.util.ArrayList;

public class PoreskaUprava {
    private String grad;

    private ArrayList<Objekat> objekti;

    public PoreskaUprava(String grad) {
        this.grad = grad;
        this.objekti = new ArrayList<>();
    }

    public PoreskaUprava() {
        this.objekti = new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat){
        this.objekti.add(objekat);
    }

    public double ukupanPorezZaCeoGrad(){
        double ukupanPorez = 0;
        for (int i = 0; i < objekti.size(); i++) {
            ukupanPorez += objekti.get(i).porez();
        }
        return ukupanPorez;
    }

    public void stampaj(){
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();
        }
    }


//    za vezbanje  - metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
    public Objekat najveciPorez(){
        Objekat najveciPorez = objekti.get(0);
        for (int i = 1; i < objekti.size(); i++) {
            if(objekti.get(i).porez()>objekti.get(i-1).porez()){
                najveciPorez = objekti.get(i);
            }
        }
        return najveciPorez;
    }



}
