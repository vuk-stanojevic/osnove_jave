package domaci_13_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {
        //Napisati program koj racuna Z prema formuli: (X - Y) NA KVADRAT. X i Y su celi brojevi.

        int X = 5;
        int Y = 7;
        // double Z = Math.pow((X-Y), 2);
        int Z = (X-Y)*(X-Y);

        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("Z = (X-Y)^2 = " + Z);
    }
}
