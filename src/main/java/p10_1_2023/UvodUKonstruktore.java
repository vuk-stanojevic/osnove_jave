package p10_1_2023;

public class UvodUKonstruktore {
    public static void main(String[] args) {

        User u = new User();

        u.setIme("Milan");
        u.setPrezime("Jovanovic");
        u.setPrezime("milan@gmail.com");

        User m = new User("Milan", "Jovanovic");

    }
}
