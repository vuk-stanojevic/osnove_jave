package p12_1_2023;

public class ViberPoruka {

    private String tekst;

    private String vreme;

    private ViberKorisnik poslao;

    private ViberKorisnik primio;

    private ViberReakcija reakcija;

    public ViberPoruka(String tekst, String vreme, ViberKorisnik poslao, ViberKorisnik primio, ViberReakcija reakcija) {
        this.tekst = tekst;
        this.vreme = vreme;
        this.poslao = poslao;
        this.primio = primio;
        this.reakcija = reakcija;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik getPoslao() {
        return poslao;
    }

    public void setPoslao(ViberKorisnik poslao) {
        this.poslao = poslao;
    }

    public ViberKorisnik getPrimio() {
        return primio;
    }

    public void setPrimio(ViberKorisnik primio) {
        this.primio = primio;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }

    public void stampaj(){
        System.out.print("From: " + this.poslao.getImeIPrezime() + " * ");
        if(this.poslao.isAktivan()){
            System.out.print("Active Now");
        } else {
            System.out.print("Not Active");
        }
        System.out.println(" - at " + this.vreme);
        System.out.println("To: " + this.primio.getImeIPrezime());
        if(this.reakcija != null){
            System.out.println(this.tekst + " : " + reakcija.getEmoji() + " from " + reakcija.getKoJeReagovao().getImeIPrezime());
        } else {
            System.out.println(this.tekst);
        }
        System.out.println();
    }

}
