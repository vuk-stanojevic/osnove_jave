package p16_1_2023;

public class DUOPaket extends Paket{

    private String uredjaj;

    public DUOPaket(String imeIPrezime, int cena, int ugovornaObaveza, String uredjaj) {
        super("EON FULL DUO", imeIPrezime, cena, ugovornaObaveza, 250, 100);
        this.uredjaj = uredjaj;
    }

    @Override
    public int brojMeseciPoDinar(){
        return 6;
    }

    public void povecajBrzinuInterneta(int povecanje){
        this.download += povecanje;
        this.upload += povecanje;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(" + " + this.brojMeseciPoDinar() + " mes. za dinar");
        System.out.println("Uredjaj uz ugovor: " + this.uredjaj);
    }
}
