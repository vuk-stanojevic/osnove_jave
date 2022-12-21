package p21_12_2022;

import java.util.ArrayList;

public class UvodPetljeNizovi {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);
        brojevi.add(17);
        brojevi.add(18);
        brojevi.add(19);
        brojevi.add(20);
        brojevi.add(21);

        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i) + ", ");
        }

    }
}
