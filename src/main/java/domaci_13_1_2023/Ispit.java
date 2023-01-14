package domaci_13_1_2023;

public class Ispit {
    private String naziv;
    private String profesor;

    private int ocena;

    public Ispit(String naziv, String profesor, int ocena) {
        this.naziv = naziv;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean ispitPolozen(){
        if(this.ocena>5){
            return true;
        } else {
            return false;
        }
    }

    public void stampaj(){
        System.out.println(this.naziv + " - " + this.profesor + " - " + this.ocena);
    }


}
