package p12_1_2023;

import java.util.ArrayList;

public class UvodUNizove {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

        User m = new User("Milan", "Jovanovic");
        User n = new User("Nikola", "Nikolic");

        users.add(m); //adresa m
        users.add(n); //adresa n
        System.out.println("KRAJ");

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getIme() + " " + users.get(i).getPrezime());
        }

    }
}
