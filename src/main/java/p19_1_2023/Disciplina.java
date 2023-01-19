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

    public void dodajAtleticara(Atleticar atleticar){
        this.atleticari.add(atleticar);
    }

    public void diskvalifikujAtleticara(String imeIPrezime){
        for (int i = 0; i < atleticari.size(); i++) {
            this.atleticari.remove(this.atleticari.get(i).getImeIPrezime().equals(imeIPrezime));
        }
    }
}
