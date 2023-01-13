package p12_1_2023;

public class ViberKorisnik {
    private String imeIPrezime;

    private String telefon;

    private boolean aktivan;

    public ViberKorisnik(String imeIPrezime, String telefon, boolean aktivan) {
        this.imeIPrezime = imeIPrezime;
        this.telefon = telefon;
        this.aktivan = aktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }
}
