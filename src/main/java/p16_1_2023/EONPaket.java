package p16_1_2023;

public class EONPaket extends Paket{

    public EONPaket(String imeIPrezime, int cena, int ugovornaObaveza) {
        super("EON LIGHT DUO", imeIPrezime, cena, ugovornaObaveza, 150, 75);
    }
    @Override
    public int brojMeseciPoDinar(){
        return 3;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(" + " + this.brojMeseciPoDinar() + " mes. za dinar");
    }
}
