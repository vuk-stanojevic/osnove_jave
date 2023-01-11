package domaci_10_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor pracet = new Autor("Terry", "Pratchett");
        Autor dramond = new Autor("Bill", "Drummond");

        Knjiga bojaMagije = new Knjiga("978-65432-10", "The Colour of Magic", 1987, pracet);
        Knjiga dedaPras = new Knjiga("132-45545-848", "Hogfather", 1999, pracet);

        Knjiga cetrdesetPet = new Knjiga("4848-848481-1515", "45", 2001, dramond);
        Knjiga manual = new Knjiga("878-884844848-155", "The Manual (How to Have a Number One the Easy Way)", 1988, dramond);
        Knjiga badWisdom = new Knjiga("11-6666666-11", "Bad Wisdom", 1997, dramond);

        pracet.stampaj();
        dramond.stampaj();
        System.out.println();

        bojaMagije.stampaj();
        dedaPras.stampaj();
        cetrdesetPet.stampaj();
        manual.stampaj();
        badWisdom.stampaj();
    }
}
