package domaci_29_12_2022;

public class SmartAirConditioning {
//(ZA VEZBANJE) Kreirati klasu SmartAirConditioning koja ima:
//- atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//- atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//- atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//- atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//- atribut za mod (hladi/greje)
//- metodu za stampu - stampa u formatu
//          marka - mod - termperatura
//- metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//          30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//- metodu koja racuna koliko klima novca potrosi za mesec dana
//          - Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//          - Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//          - Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

    private String marka;

    private double potrosnjaHladi;

    private double potrosnjaGreje;

    private int temperatura;

    private String mod;

    public void stampa(){
        System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + "*C");
    }

    public double mesecnaPotrosnjaEnergije(){
        double mesecnaPotrosnjaEnergije = 0;
        if(this.mod.equals("hladi")){
            mesecnaPotrosnjaEnergije = 30*15*this.potrosnjaHladi;
        }else if(this.mod.equals("greje")){
            mesecnaPotrosnjaEnergije = 30*15*this.potrosnjaGreje;
        }
        return mesecnaPotrosnjaEnergije;
    }

    public double mesecnjaPotrosnjaCena(){
        double mesecnaPotrosnjaCena;
        if(this.mesecnaPotrosnjaEnergije()<=350){
            return mesecnaPotrosnjaCena = mesecnaPotrosnjaEnergije() * 6;
        } else {
            return mesecnaPotrosnjaCena = 350 * 6 + ((mesecnaPotrosnjaEnergije()-350)*9);
        }
    }

    public String getMarka(){
        return this.marka;
    }

    public void setMarka(String m){
        this.marka = m;
    }

    public double getPotrosnjaHladi() {
        return this.potrosnjaHladi;
    }

    public void setPotrosnjaHladi(double ph){
        this.potrosnjaHladi = ph;
    }

    public double getPotrosnjaGreje() {
        return this.potrosnjaGreje;
    }

    public void setPotrosnjaGreje(double pg) {
        this.potrosnjaGreje = pg;
    }

    public int getTemperatura(){
        return this.temperatura;
    }

    public void setTemperatura(int t){
        this.temperatura = t;
        if(this.temperatura<16){
            this.temperatura=16;
        } else if(this.temperatura>35){
            this.temperatura=35;
        }
    }

    public String getMod(){
        return this.mod;
    }

    public void setMod(String m){
        this.mod = m;
    }

}
