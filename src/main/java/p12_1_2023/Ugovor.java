package p12_1_2023;

public class Ugovor {
//    Kreirati klasu Ugovor koja ima:
//godinu, dan i mesec sklapanja ugovora
//osobu koja prodaje nekretninu (fizicko lice)
//osobu koja kupuje nekretninu (fizicko lice)
//cenu za koju se prodaje nekretnina
//adresu nekretnine (ulica br., grad)
//metodu koja vraca procenat zarade
//za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//1000 + cena za koju se prodaje * procenat zarade
//metodu koja stampa ugovor u formatu:
//Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca)
// o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi
// da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

    private String datum;

    private FizickoLice prodavac;

    private FizickoLice kupac;

    private double cena;

    private String adresa;

    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, double cena, String adresa) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenat(){
//        return kupac.getKupovaoRanije() ? 0.02 : 0.03;     //ternarni operator
        if(kupac.getKupovaoRanije()){
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zarada(){
        return 1000+this.cena*this.procenat();
    }

    public void stampa(){
        System.out.println("Dana " + this.datum + "god sklopljen je ugovor izmedju " + this.prodavac.getImeIPrezime() +  " i " + this.kupac.getImeIPrezime()
                 + "\n" +
                "o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena + " pri cemu je kupac u obavezi\n" +
                "da agenciji isplati novcanu vrednost u iznosu od " + this.zarada());
    }
}
