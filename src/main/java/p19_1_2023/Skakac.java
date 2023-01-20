package p19_1_2023;

public class Skakac extends Atleticar{

    public Skakac() {
    }

    public Skakac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiOd(Atleticar atleticar){
        if(this.rezultat > atleticar.rezultat){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(" metara");
    }
}
