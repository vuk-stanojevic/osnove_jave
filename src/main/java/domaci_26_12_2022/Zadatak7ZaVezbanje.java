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

        System.out.println(celihBrojevaIzmedju(5,10));
        System.out.println();
        System.out.println(celihBrojevaIzmedju(-5, 1));
        System.out.println();
        System.out.println(celihBrojevaIzmedju(5,5));
        System.out.println();
        System.out.println(celihBrojevaIzmedju(10, 5));
        System.out.println();
        System.out.println(celihBrojevaIzmedju(1, -5));
    }

    public static int celihBrojevaIzmedju(int x, int y){
        if(y>x){
            return y-x-1;
        } else if(y==x){
            return 0;
        } else {
            return -(y-x+1);
        }
    }
}
