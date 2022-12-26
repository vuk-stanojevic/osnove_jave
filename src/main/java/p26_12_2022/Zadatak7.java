package p26_12_2022;

public class Zadatak7 {
    public static void main(String[] args) {
//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//Primer: Ako se metoda pozove za N=10, vraca -10
//	Ako se metoda pozove za N=-11, vraca 11

        System.out.println(suprotni(-8));

    }

    public static int suprotni(int broj){
        int suprotni = -broj;

        return suprotni;
    }
}
