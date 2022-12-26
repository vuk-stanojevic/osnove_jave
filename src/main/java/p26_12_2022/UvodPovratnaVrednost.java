package p26_12_2022;

public class UvodPovratnaVrednost {

    public static void main(String[] args) {
        int x = suma(10, 5);
        System.out.println(x);

        int z = abs(-5);
        System.out.println(z);

    }

//    void => ne vracamo nista
//    povratni tipovi koji vracaju su int, double, String, boolean, char, ArrayList<String>...

    public static int suma (int a, int b){
        int zbir = a + b;

        return zbir+232;
    }

    public static int abs(int x){
//        int a = 0;
//        if(x<0){
//            a = -x;
//        }else{
//            a=x;
//        }
//        return a;
        if(x<0){
            return -x;
        }else{
            return x;
        }
    }
}
