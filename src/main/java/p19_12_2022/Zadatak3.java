package p19_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//        Izvrsenje:
//        2 na stepen 7 je 128

        int stepen = 1;

//        N^K = N*N*N*N*N*N*N
//        2^7 = 2*2*2*2*2*2*2 = 128

        for (int i = 1; i <=7 ; i++) {
            stepen=stepen*2;
        }

        System.out.println("2 na stepen 7 je " + stepen);
    }
}
