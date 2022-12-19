package p19_12_2022;

import java.util.Scanner;

public class UnosSaTastatureUPetlji {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            System.out.println("Uneli ste " + broj);
        }

    }
}
