package p10_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zad Kreirati klasu Radnik koja ima:
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
//        Racuna se tako sto se pomnozi stepen strucne spreme i broj dece.
//metodu koja racuna platu radnika, plata se racuna po formuli:
//25000 + (koeficijent slozenosti + minuli rad) * 10000
//metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//- do 10 godina 0.05
//- od 10-20 godina 0.075
//- preko 20 godina 0.1

        Radnik zemljoradnik = new Radnik("1101921755012");
        zemljoradnik.setBrojDece(3);
        zemljoradnik.setImeIPrezime("Radoje Mrnjavcevic");
        zemljoradnik.setGodineRadnogStaza(9);
        zemljoradnik.setStepenStrucneSpreme(1);

        System.out.println(zemljoradnik.minuliRad());
        System.out.println(zemljoradnik.koeficijentSlozenosti());
        System.out.println(zemljoradnik.plata());
        System.out.println(zemljoradnik.kreditnoSposoban());

        Radnik menadzer = new Radnik ("01234567891223", "Milorad Miskovic", 4, 8, 35);
        System.out.println(menadzer.minuliRad());
        System.out.println(menadzer.koeficijentSlozenosti());
        System.out.println(menadzer.plata());
        System.out.println(menadzer.kreditnoSposoban());
    }
}
