package p29_12_2022;

public class Student {
//    Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge

    private String ime;

    private String prezime;

    private int brojIndeksa;

    private boolean budzet;

    public void setIme(String i) {
        this.ime = i;
    }

    public String getIme(){
        return this.ime;
    }

    public void setPrezime(String p) {
        this.prezime = p;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setBrojIndeksa(int bi) {
        this.brojIndeksa = bi;
    }

    public int getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBudzet(boolean b) {
        this.budzet = b;
    }

    public boolean getBudzet() {
        return this.budzet;
    }


}
