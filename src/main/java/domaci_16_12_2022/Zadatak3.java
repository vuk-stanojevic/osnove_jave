package domaci_16_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

//        Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//        sve parne stampa kao negativne a
//        sve neprane kao pozitivne brojeve
//        Primer izvrssenja:
//        0, 1, -2, 3, -4, 5, -6, ……..

//       Varijanta 1:
//         posto nula ne moze da ima minus, onda ona mora da se odstampa van petlje
//        System.out.print("0, ");
//
//        for (int i = 1; i <=100; i++) {
//            if(i%2==0){
////                System.out.print("-" + i + ", ");
//                System.out.print(-1*i + ", ");
//            } else {
//                System.out.print(i + ", ");
//            }
//        }


//        Varijanta 2:
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(-1 * i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
