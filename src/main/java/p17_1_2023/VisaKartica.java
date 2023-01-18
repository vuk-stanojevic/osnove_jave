package p17_1_2023;

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double iznos){
        if(iznos*0.018<4) {
            this.suma = this.suma - (iznos + 4);
        } else {
            this.suma = this.suma - (iznos + iznos*0.018);
        }
    }

    @Override
    public void stampaj(){
        System.out.println("Visa Card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
        System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
    }
}
