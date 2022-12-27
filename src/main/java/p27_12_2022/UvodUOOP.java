package p27_12_2022;

public class UvodUOOP {
    public static void main(String[] args) {

//        String ime = "Milan";
//        String prezime = "Jovanovic";
//        int starost = 27;

        User milan = new User(); //user je tip promenljive (milan), cela ova linija se zove objekat ili instanca;
        // objekat (instanca) klase User

        milan.firstName = "Milan";
        milan.lastName = "Jovanovic";
        milan.yearOfBirth = 1989;
        int starost = milan.vratiStarost(2022);

        System.out.println(milan);
        System.out.println(milan.firstName + " " + milan.lastName + ", " + milan.yearOfBirth + "god.");

//        User.stampajUsera(milan.firstName, milan.lastName, milan.age);
        milan.stampaj();
        milan.stampajStarost(2022);

        User nikola = new User();
        nikola.firstName = "Nikola";
        nikola.lastName = "Nikolic";
        nikola.yearOfBirth = 1995;
        System.out.println(nikola);
        System.out.println(nikola.firstName);

//        User.stampajUsera(nikola.firstName, nikola.lastName, nikola.age);
        nikola.stampaj();
        nikola.stampajStarost(2022);

    }


}
