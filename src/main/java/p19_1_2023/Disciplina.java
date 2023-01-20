package p19_1_2023;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Disciplina {

    private String imeDiscipline;

    private String tipDiscipline;

    private ArrayList<Atleticar> atleticari;

    public Disciplina() {
        this.atleticari = new ArrayList<>();
    }

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.atleticari = new ArrayList<>();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }

    public void dodajAtleticara(Atleticar atleticar){
        this.atleticari.add(atleticar);
    }

    public void diskvalifikujAtleticara(String imeIPrezime){
        for (int i = 0; i < this.atleticari.size(); i++) {
            if(this.atleticari.get(i).getImeIPrezime().equals(imeIPrezime)){
                this.atleticari.remove(i);
            }
        }
    }

//    (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
    public Atleticar nadjiNajboljeg(){
        Atleticar najbolji = this.atleticari.get(0);
            for (int i = 0; i < this.atleticari.size(); i++) {
//                if (this.atleticari.get(i).getRezultat()<najbolji.getRezultat()){
                if (this.atleticari.get(i).daLiJeBoljiOd(najbolji)) {
                    najbolji = this.atleticari.get(i);
                }
            }
        return najbolji;
    }

//    (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//    (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.
    public void podaciNajboljeg(){
        this.nadjiNajboljeg().stampaj();
    }


}
