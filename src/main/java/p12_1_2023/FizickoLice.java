package p12_1_2023;

public class FizickoLice {
    //Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//ime i prezime
//broj licne karte
//jmbg
//podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//konstuktore
//gettere i settere, jmbg ne sme da se menja
//metodu stampaj, koja stmpa podatke u formatu:
//ime i prezime, broj licne karte

    private String imeIPrezime;

    private String licnaKarta;

    private String jmbg;

    public boolean kupovaoRanije;

    public FizickoLice(String imeIPrezime, String licnaKarta, String jmbg, boolean kupovaoRanije) {
        this.imeIPrezime = imeIPrezime;
        this.licnaKarta = licnaKarta;
        this.jmbg = jmbg;
        this.kupovaoRanije = kupovaoRanije;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getLicnaKarta() {
        return licnaKarta;
    }

    public void setLicnaKarta(String licnaKarta) {
        this.licnaKarta = licnaKarta;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean getKupovaoRanije() {
        return kupovaoRanije;
    }

    public void setKupovaoRanije(boolean kupovaoRanije) {
        this.kupovaoRanije = kupovaoRanije;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.licnaKarta);
    }
}
