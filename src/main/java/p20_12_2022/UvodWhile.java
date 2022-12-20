package p20_12_2022;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {

//        ovo ispod je obicna for petlja i takva petlja uvek treba da se radi kao for, nikad kao while jer je neprirodno
//        int i = 0;
//        while (i<5) {
//            System.out.println(i);
//            i++;
//        }
//    System.out.println("Kraj");

        Scanner s = new Scanner(System.in);
        int broj = -1;

        while (broj!=0) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();

            System.out.println("Unet broj je " + broj);
        }

        System.out.println("Uneta je nula");

    }

}
