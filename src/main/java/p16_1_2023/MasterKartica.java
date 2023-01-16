package p16_1_2023;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double stanjeDolari, String brojKartice, int godina, int mesec) {
        super(stanjeDolari, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos){
            this.stanjeDolari = this.stanjeDolari - (iznos + 2);
    }

    public void naplatiOdrzavanje(){
        this.stanjeDolari = this.stanjeDolari - 2;
    }

    @Override
    public void stampaj(){
        super.stampaj();
    }
}
