package p26_12_2022;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati metodu koja proverava da li je trougao pravougli.
//        Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

        if(pravougliDaNe(3,4,5)){
            System.out.println("Trougao je pravougli");
        }else{
            System.out.println("Trougao nije pravougli");
        }
//        System.out.println(pravougliDaNe(3, 4, 5));
        System.out.println();
        if(pravougliDaNe(3, 4, 6)){
            System.out.println("Trougao je pravougli");
        }else{
            System.out.println("Trougao nije pravougli");
        }
//        System.out.println(pravougliDaNe(3, 4, 6));
    }

    public static boolean pravougliDaNe(int a, int b, int c){
        if(a*a+b*b==c*c){
            return true;
        }else{
            return false;
        }
    }
}
