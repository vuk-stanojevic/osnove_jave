package p12_1_2023;

public class ZoomCall {
//	Kreirati klasu ZoomCall koja ima:
//link za poziv
//password
//korisnika koji je host
//korisnika koji je guest
//gettere za sve atribute
//setter samo za guest-a
//metodu pokreni poziv koja stampa podatke u formatu:
//
//		Zoom Call: url
//		Password: password
//		Host: ime i prezime
//		Guest: ime i prezime
//		Maksimalno trajanje poziva je (broj minuta)min
//
//		Maksimalno trajanje poziva se cita od korisnika koji je host!
    private String link;

    private String password;

    public Korisnik host;

    public Korisnik guest;

    public ZoomCall(String link, String password, Korisnik host, Korisnik guest) {
        this.link = link;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public String getLink() {
        return link;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public void pokreniPoziv(){
        System.out.println("Zoom Call: " + this.link);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        System.out.println("Guest: " + this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je " + this.host.maksimalniPoziv() + " min");
    }
}
