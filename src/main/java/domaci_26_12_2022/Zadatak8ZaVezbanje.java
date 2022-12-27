package domaci_26_12_2022;

public class Zadatak8ZaVezbanje {
    public static void main(String[] args) {
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        System.out.println(najmanjiOd3(2, 3, 1));

    }

    public static int najmanjiOd3(int prvi, int drugi, int treci){
//        varijanta sa Math.min
//        int najmanji = Math.min(prvi, Math.min(drugi, treci));
//        return najmanji;

//        varijanta bez Math.min
        int najmanji = prvi;
        if (prvi>drugi){
            najmanji = drugi;
        }
        if(najmanji>treci){
            najmanji = treci;
        }
        return najmanji;
    }
}
