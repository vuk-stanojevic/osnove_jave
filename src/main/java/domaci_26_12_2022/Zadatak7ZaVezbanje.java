package domaci_26_12_2022;

public class Zadatak7ZaVezbanje {
    public static void main(String[] args) {
//       Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//Napomena: Resiti bez koriscenja petlji.

        izbroji(5, 10);
        System.out.println();
        izbroji(-5, 1);
    }

    public static void izbroji(int x, int y){
        System.out.println(y-x-1);
    }
}
