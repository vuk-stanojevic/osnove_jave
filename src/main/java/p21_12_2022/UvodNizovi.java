package p21_12_2022;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {

        System.out.println("POCETAK");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        String prvi = cars.get(0);
        System.out.println(prvi);

        cars.set(0, "Audi");

        cars.remove(2);

        System.out.println("KRAJ");

    }
}
