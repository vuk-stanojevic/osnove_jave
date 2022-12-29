package p29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//Kreirati klasu Student koja ima:
//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
//gettere i settere za sve atributge

        Student brucos = new Student();
        brucos.setIme("Petar");
        brucos.setPrezime("Petrovic");
        brucos.setBrojIndeksa(456);
        brucos.setBudzet(true);

        System.out.println("Ime studenta: " + brucos.getIme());
        System.out.println("Prezime studenta: " + brucos.getPrezime());
        System.out.println("Broj indeksa: " + brucos.getBrojIndeksa());
        System.out.println("Na budzetu (true/false): " + brucos.getBudzet());

    }
}
