package p13_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//        [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//        [BOJA], [VELICINA]
//
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
//                Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5

        String sifraProizvoda;
        String nazivProizvoda;
        double cena;
        double popust;
        String boja;
        double velicina;

        sifraProizvoda="x932k20";
        nazivProizvoda="Nike Patike";
        cena = 90;
        popust = 13.5;
        boja = "crna";
        velicina = 46.5;

        System.out.println("Sifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - $" + cena + " - Popust" + popust + "%");
        System.out.println(boja + ", " + velicina);
    }
}
