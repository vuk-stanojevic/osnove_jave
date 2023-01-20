package p19_1_2023;

public class Trkac extends Atleticar{

    public Trkac() {
    }

    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiOd(Atleticar atleticar){
        if(this.rezultat < atleticar.rezultat){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println(" sekundi");
    }


}
