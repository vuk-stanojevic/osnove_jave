package domaci_13_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

//        Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
//        Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica,
//        kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite
//        ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//        Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String brojKartice = "1234 5678 9012 3456";
        String mesec = "05"; //u slucaju da radimo sa posebnim promenljivama za mesec i godinu,
        //mesec mora da ide kao string da bi prikazao i nulu na mestu prve cifre
        int godina = 25;
        String ime = "Milan";
        String prezime = "Jovanovic";

        System.out.println("*************************************");
        System.out.println("*    Credit Card                    *");
        System.out.println("*    ****                           *");
        System.out.println("*    ****                           *");
        System.out.println("*     " + brojKartice + "           *");
        System.out.println("*                    valid > " + mesec + "/" + godina + "  *");
        System.out.println("*                                   *");
        System.out.println("*    " + ime + " " + prezime + "                *");
        System.out.println("*************************************");

    }
}
