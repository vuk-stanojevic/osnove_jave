package domaci_29_12_2022;

public class FacebookPost {
    //        Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//gettere za sve atribute
//settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1

    private String koJeObjavio;

    public String getKoJeObjavio(){
        return this.koJeObjavio;
    }

    public void setKoJeObjavio(String kjo){
        this.koJeObjavio = kjo;
    }

    private String gdeJeObjavljeno;

    public String getGdeJeObjavljeno(){
        return this.gdeJeObjavljeno;
    }

    public void setGdeJeObjavljeno(String gjo){
        this.gdeJeObjavljeno = gjo;
    }

    private String tekstObjave;

    public String getTekstObjave(){
        return this.tekstObjave;
    }

    public void setTekstObjave(String to){
        this.tekstObjave = to;
    }

    private int brojLajkova;

    public int getBrojLajkova(){
        return this.brojLajkova;
    }

    private int brojDeljenja;

    public int getBrojDeljenja(){
        return this.brojDeljenja;
    }

    public void like(){
        this.brojLajkova++;
    }

    public void dislike(){
        this.brojLajkova--;
        if(brojLajkova<0){
            brojLajkova=0;
        }
    }

    public void share(){
        this.brojDeljenja++;
    }

    public void print(){
        System.out.println(this.koJeObjavio + " >>> " + this.gdeJeObjavljeno);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
    }
}
