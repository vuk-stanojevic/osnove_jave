package p10_1_2023;

public class Radnik {
//    Zad Kreirati klasu Radnik koja ima:
//jmbg radnika
//ime i prezime
//broj dece (1,2,3,... ili 0 ako nema dece)
//stepen strucne spreme (od 1 do 8)
//godine radnog staza
//konstuktor koji postavlja samo jmbg
//konstuktor koji postavlja sve atribute
//getere i setere
//metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1

    private String jmbg;

    private String imeIPrezime;

    private int brojDece;

    private int stepenStrucneSpreme;

    private int godineRadnogStaza;

    public Radnik(String jmbg){
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public String getJmbg() {
        return jmbg = jmbg;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojDece() {
        return brojDece;
    }

    public int getStepenStrucneSpreme() {
        return stepenStrucneSpreme;
    }

    public int getGodineRadnogStaza() {
        return godineRadnogStaza;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setBrojDece(int brojDece) {
        this.brojDece = brojDece;
    }

    public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
        this.stepenStrucneSpreme = stepenStrucneSpreme;
    }

    public void setGodineRadnogStaza(int godineRadnogStaza) {
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad(){
        if(this.godineRadnogStaza<10){
            return 0.05;
        } else if(this.godineRadnogStaza>=10 && this.godineRadnogStaza<20){
            return 0.075;
        } else if(this.godineRadnogStaza>=20){
            return 0.1;
        }
        return 1;
    }

    public double koeficijentSlozenosti(){
        return this.stepenStrucneSpreme*this.brojDece;
    }

    public double plata(){
        return 25000+(koeficijentSlozenosti()+minuliRad())*10000;
    }

    public boolean kreditnoSposoban(){
        return plata()>50000;
    }

}
