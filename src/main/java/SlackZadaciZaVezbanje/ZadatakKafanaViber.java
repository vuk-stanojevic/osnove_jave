package SlackZadaciZaVezbanje;

import java.util.Scanner;

public class ZadatakKafanaViber {

    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava sledece podatke:
//        Ime
//        Prezime
//        da li si bio zadnji put na okupljanju (boolean tip)
//        status na kursu ("predavac" ili "polaznik")
//        A zatim program ispisuje poruku na ekranu da li si materijal za viber grupu ili ne.
//        Za svakog ko je po statusu polaznik i bio je na prethodnom okupljanju ispisuje se poruka
//        "Dobrodoso + ime + prezime", za sve ostale situacije
//        ispisati poruku "Da se ne pita Nikoleta, ime + prezime bi bio u grupi"

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite da li ste poslednji put bili na okupljanju (true ili false): ");
        boolean prisustvo = s.nextBoolean();

        System.out.print("Unesite status na kursu (predavac ili polaznik): ");
        String status = s.next();


        if(status.equals("polaznik") && prisustvo==true){
            System.out.println("Welcome u Viber grupu, " + ime + prezime);
        } else {
            System.out.println("Da se ne pita Nikoleta, " + ime + " " + prezime + " bi bio u grupi");
        }
    }
}
