package p16_1_2023;

public class PlatnaKartica {
    protected double stanjeDolari;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double stanjeDolari, String brojKartice, int godina, int mesec) {
        this.stanjeDolari = stanjeDolari;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getStanjeDolari() {
        return stanjeDolari;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void dodajSredstva(double iznos){
        this.stanjeDolari = this.stanjeDolari + iznos;
    }

    public void izvrsiTransakciju(double iznos){
        this.stanjeDolari = this.stanjeDolari - iznos;
    }

    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.stanjeDolari);
    }
}
