package p19_1_2023;

public abstract class Objekat {
    protected String ulicaIBroj;
    protected double povrsina;
    protected int zona;

    public String getUlicaIBroj() {
        return ulicaIBroj;
    }

    public void setUlicaIBroj(String ulicaIBroj) {
        this.ulicaIBroj = ulicaIBroj;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public Objekat() {
    }

    public Objekat(String ulicaIBroj, double povrsina, int zona) {
        this.ulicaIBroj = ulicaIBroj;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public double koeficijent(){
        if(this.zona == 1){
            return 1.4;
        } else if (this.zona == 2){
            return 1.1;
        } else {
            return 1.05;
        }
    }

    public abstract double porez();
    public abstract void stampaj();


}
