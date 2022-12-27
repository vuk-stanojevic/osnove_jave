package domaci_26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        int x = 7;
        stampajVrednostZa10Vecu(x);

        stampajVrednostZa10Vecu(9);

        stampajVrednostZa10Vecu(x+87);

    }

    public static void stampajVrednostZa10Vecu (int originalna){
        System.out.println(originalna+10);
    }
}
