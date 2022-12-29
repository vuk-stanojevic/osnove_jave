package p29_12_2022;

public class User { //user je tip, odnosno box koji cuva sve podatke (ime, prezime, starost) na jednom mestu

    private String firstName;
    private String lastName;
    private int yearOfBirth;

    //    getter za vracanje atributa firstName
    public String getfirstName(){
        return this.firstName;
    }

    //
    public void setFirstName(String fn){
        this.firstName = fn;
    }

//        public static void stampajUsera (String firstName, String lastName, int age){
//        System.out.println(firstName + " " + lastName + ", " + age + "god.");
    public void stampaj(){
        System.out.println(this.firstName + " " + this.lastName + ", " + this.yearOfBirth + " god.");
    }

    public void stampajStarost(int currentYear){
        System.out.println(currentYear-this.yearOfBirth);
    }

    private int vratiStarost(int currentYear){
        int a = currentYear - this.yearOfBirth;
        return a;
    }

}
