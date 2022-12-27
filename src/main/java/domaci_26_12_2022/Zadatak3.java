package domaci_26_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
//        vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        int x = 2;
        int y = 3;
        System.out.println(novaVrednost(x,y));
        System.out.println();
        System.out.println(novaVrednost(6,2));

    }

    public static int novaVrednost(int desetice, int jedinice){
        int noviBroj = desetice*10 + jedinice;
        return noviBroj;
    }
}
