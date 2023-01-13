package domaci_12_1_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//1. Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ArrayList<ZeleniKarton> kartoni = new ArrayList<>();

        ZeleniKarton matematika = new ZeleniKarton("Petar Petrovic", 14123, "Matematika", "Rene Dekart", 9);
        ZeleniKarton fizika = new ZeleniKarton("Petar Petrovic", 14123, "Fizika", "Ricard Fejnman", 10);
        ZeleniKarton hemija = new ZeleniKarton("Petar Petrovic", 14123,"Hemija", "Dmitrij Mendeljejev", 8);
        ZeleniKarton fizicko = new ZeleniKarton("Petar Petrovic", 14123, "Fizicko", "Jusein Bolt", 5);
        ZeleniKarton muzicko = new ZeleniKarton("Petar Petrovic", 14123, "Muzicko", "Nils Fram", 7);
        ZeleniKarton likovno = new ZeleniKarton("Petar Petrovic", 14123, "Likovno", "Rene Magrit", 6);
        ZeleniKarton informatika = new ZeleniKarton("Petar Petrovic", 14123, "Informatika", "Kevin Mitnik", 10);
        ZeleniKarton tehnicko = new ZeleniKarton("Petar Petrovic", 14123, "Tehnicko", "Le Korbizje", 9);
        ZeleniKarton srpski = new ZeleniKarton("Petar Petrovic", 14123, "Srpski", "Branislav Nusic", 10);
        ZeleniKarton engleski = new ZeleniKarton("Petar Petrovic", 14123, "Engleski", "Barak Obama", 5);
        ZeleniKarton geografija = new ZeleniKarton("Petar Petrovic", 14123, "Geografija", "Vasko Da Gama", 10);

        kartoni.add(matematika);
        kartoni.add(fizika);
        kartoni.add(hemija);
        kartoni.add(fizicko);
        kartoni.add(muzicko);
        kartoni.add(likovno);
        kartoni.add(informatika);
        kartoni.add(tehnicko);
        kartoni.add(srpski);
        kartoni.add(engleski);
        kartoni.add(geografija);

//        for (int i = 0; i < kartoni.size(); i++) {
//            System.out.println("Student: " + kartoni.get(i).getStudent());
//            System.out.println("Broj indeksa: " + kartoni.get(i).getBrojIndeksa());
//            System.out.println("Predmet: " + kartoni.get(i).getPredmet());
//            System.out.println("Profesor: " + kartoni.get(i).getProfesor());
//            System.out.println("Ocena: " + kartoni.get(i).getOcena());
//            System.out.println("Polozio: " + kartoni.get(i).polozen());
//            System.out.println();
//        }

        for (int i = 0; i < kartoni.size(); i++) {
            kartoni.get(i).stampaj();
            kartoni.get(i).polozen();
            System.out.println();
        }

        double suma = 0;

        for (int i = 0; i < kartoni.size(); i++) {
            suma = suma + kartoni.get(i).getOcena();
        }
        double prosek = suma/kartoni.size();

        System.out.println("Prosecna ocena svih ispita je: " + prosek);

        suma = 0;
        int polozeni = 0;

        for (int i = 0; i < kartoni.size(); i++) {
            if(kartoni.get(i).polozen()){
                suma = suma + kartoni.get(i).getOcena();
                polozeni++;
            }
        }
        prosek = suma/polozeni;

        System.out.println("Prosecna ocena polozenih ispita je: " + prosek);
    }
}
