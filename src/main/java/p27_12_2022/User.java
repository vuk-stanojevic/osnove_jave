package p27_12_2022;

public class User { //user je tip, odnosno box koji cuva sve podatke (ime, prezime, starost) na jednom mestu

    public String firstName;
    public String lastName;
    public int yearOfBirth;

    public static void stampajUsera (String firstName, String lastName, int age){
        System.out.println(firstName + " " + lastName + ", " + age + "god.");
    }

    public void stampaj(){
        System.out.println(this.firstName + " " + this.lastName + ", " + this.yearOfBirth + " god.");
    }

    public void stampajStarost(int currentYear){
        System.out.println(currentYear-this.yearOfBirth);
    }

    public int vratiStarost(int currentYear){
        int a = currentYear - this.yearOfBirth;
        return a;
    }

}
