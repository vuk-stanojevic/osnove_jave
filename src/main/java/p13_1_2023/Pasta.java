package p13_1_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public void dodajSastojak(Sastojak sastojak){
        this.sastojci.add(sastojak);
    }

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }

    public double cenaPaste(){
        double cenaPaste = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            cenaPaste = cenaPaste + this.sastojci.get(i).getCena();
        }
        return cenaPaste;
    }

    public void stampa(){
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }
        System.out.println("Cena paste je " + this.cenaPaste() + ".din");
    }

    public void brisiSastojak(String naziv){
        for (int i = 0; i < sastojci.size(); i++) {
            if(this.sastojci.get(i).getNaziv().equals(naziv)){
                this.sastojci.remove(i);
            }
        }
    }
}
