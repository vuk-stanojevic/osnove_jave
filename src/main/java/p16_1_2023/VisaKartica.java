package p16_1_2023;

public class VisaKartica extends PlatnaKartica{

    private String ovlascenoLice;

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    public VisaKartica(double stanjeDolari, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(stanjeDolari, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double iznos){
        if(iznos*0.018<4) {
            this.stanjeDolari = this.stanjeDolari - (iznos + 4);
        } else {
            this.stanjeDolari = this.stanjeDolari - (iznos + iznos*0.018);
        }
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Ovlasceno lice: " + this.ovlascenoLice);
    }
}
