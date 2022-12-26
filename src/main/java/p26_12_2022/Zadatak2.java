package p26_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati dve metode, jedna metoda sluzi za stampanje imena
//        a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje
//        tako da se 5 puta ispise ime i prezime u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic

        for (int i = 0; i < 5; i++) {
            stampajIme();
            System.out.print(" ");
            stampajPrezime();
            System.out.println();
        }

    }

    public static void stampajIme(){
        System.out.print("Vuk");
    }

    public static void stampajPrezime(){
        System.out.print("Stanojevic");
    }
}
