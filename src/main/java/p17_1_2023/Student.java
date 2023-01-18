package p17_1_2023;

public abstract class Student {
    protected String ime;
    protected String prezime;
    protected int indeks;
    protected int godinaStudija;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Student(String ime, String prezime, int indeks, int godinaStudija) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
        this.godinaStudija = godinaStudija;
    }

    public abstract int cenaSkolarine();

    public abstract boolean budzet();

    public void stampa(){
        System.out.println(this.ime + " " + this.prezime + ", " + this.indeks + ", " + this.godinaStudija);
        System.out.print("Finansiranje: ");
        if(budzet()){
            System.out.println("budzet");
        } else {
            System.out.println("samofinansirajuci");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }
}
