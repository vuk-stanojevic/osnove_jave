package p13_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//        [IME I PREZIME]
//        [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//        [EMAIL]

        String imeIPrezime = "Vuk Stanojevic";
        String brojTelefona = "0637688807";
        String ulicaIBroj = "Hajduk Veljkova 42a/2";
        String grad = "Nis";
        String email = "vukstanojevic42@gmail.com";

        System.out.println(imeIPrezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + grad);
        System.out.println(email);
    }
}
