package p16_1_2023;

public class Paket {
    protected String naziv;
    protected String imeIPrezime;
    protected int cena;
    protected int ugovornaObaveza;
    protected int download;
    protected int upload;

    public String getNaziv() {
        return naziv;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public int getDownload() {
        return download;
    }

    public int getUpload() {
        return upload;
    }

    public Paket(String naziv, String imeIPrezime, int cena, int ugovornaObaveza, int download, int upload) {
        this.naziv = naziv;
        this.imeIPrezime = imeIPrezime;
        this.cena = cena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.download = download;
        this.upload = upload;
    }

    public void produziUgovor(){
        this.ugovornaObaveza += 12;
    }

    public int brojMeseciPoDinar(){
        return 0;
    }

    public void stampaj(){
        System.out.println("Korisnik: " + this.imeIPrezime);
        System.out.println("Paket " + this.naziv + " - " + this.download + "/" + this.upload + " - " + this.ugovornaObaveza + " mes.");
        System.out.print("Cena: " + this.cena + " dinara");
    }
}
