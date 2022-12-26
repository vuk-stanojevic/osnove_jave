package p26_12_2022;

public class UvodParametri {
    public static void main(String[] args) {
        String punoIme = "Milan Jovanovic";
        printCard("Milan", "Jovanovic", 5, 23, "1234-5678-9012-3456");

        printCard("Dragan", "Draganovic", 6, 26, "7897-1234-4545-3456");
    }

    public static void printCard(String ime, String prezime, int mesec, int godina, String brojKartice){
        System.out.println("******************************");
        System.out.println("*                            *");
        System.out.println("*                            *");
        System.out.println("*        " + mesec + "/" + godina + "       *");
        System.out.println("*       " + ime + " " + prezime + "      *");
        System.out.println("*      " + brojKartice + "                 *");
        System.out.println("*                            *");
        System.out.println("******************************");

    }
}
