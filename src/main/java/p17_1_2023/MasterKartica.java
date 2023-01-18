package p17_1_2023;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double iznos){
            this.suma = this.suma - (iznos + 2);
    }

    public void naplatiOdrzavanje(){
        this.suma = this.suma - 2;
    }

    @Override
    public void stampaj(){
        System.out.println("Master Card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
}
