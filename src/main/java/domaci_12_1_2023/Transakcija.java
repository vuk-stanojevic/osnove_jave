package domaci_12_1_2023;

public class Transakcija {
    private String id;

    private Racun saKogRacuna;

    private Racun naKojiRacun;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getSaKogRacuna() {
        return saKogRacuna;
    }

    public void setSaKogRacuna(Racun saKogRacuna) {
        this.saKogRacuna = saKogRacuna;
    }

    public Racun getNaKojiRacun() {
        return naKojiRacun;
    }

    public void setNaKojiRacun(Racun naKojiRacun) {
        this.naKojiRacun = naKojiRacun;
    }

    public Transakcija(String id, Racun saKogRacuna, Racun naKojiRacun) {
        this.id = id;
        this.saKogRacuna = saKogRacuna;
        this.naKojiRacun = naKojiRacun;
    }

    public double provizija(double iznos){
        if(iznos<4500){
            return 45;
        } else {
            return iznos*0.01;
        }
    }

    public void izvrsiTransakciju(double iznos){
        if(this.saKogRacuna.getStanje()-iznos>0) {
            this.saKogRacuna.promena(-iznos);
            this.saKogRacuna.promena(-provizija(iznos));
            this.naKojiRacun.promena(iznos);
        }
    }

    public void stampa(){
        System.out.println("Transakcija " + this.id);
        System.out.println("Racun sa kog se vrsi transakcija: " + this.saKogRacuna.getImePrezime() + " - " + this.saKogRacuna.getBroj());
        System.out.println("Racun na koji se vrsi transakcija: " + this.naKojiRacun.getImePrezime() + " - " + this.naKojiRacun.getBroj());
    }
}
