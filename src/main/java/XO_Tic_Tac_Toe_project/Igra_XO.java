package XO_Tic_Tac_Toe_project;

import java.util.Scanner;

public class Igra_XO {
    public static void main(String[] args) {

        XO_Tabla igra = new XO_Tabla();

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime igraca X: ");
        igra.setImeXIgraca(s.next());
        System.out.print("Unesite ime igraca O: ");
        igra.setImeOIgraca(s.next());

        igra.pokreniIgru();

        while(!igra.popunjenaTabla() && !igra.pobednikX() && !igra.pobednikO()){
            igra.stampaj();
            System.out.println("Na potezu je igrac " + igra.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int poljePotez = s.nextInt();
//            while(poljePotez>9 || poljePotez<1 || !igra.poljePrazno(poljePotez)){
            while(!igra.poljePrazno(poljePotez)){
                System.out.println("Potez nije validan!");
                System.out.print("Odigraj potez: ");
                poljePotez = s.nextInt();
            }
            igra.odigrajPotez(poljePotez);
            igra.zameniIgraca();
        }

        igra.stampaj();

        if(igra.popunjenaTabla() && !igra.pobednikX() && !igra.pobednikO()){
            System.out.println("Igra je neresena.");
        } else if(igra.pobednikX()){
            System.out.println("Cestitamo! Pobednik je igrac X!");
            System.out.println("Bravo " + igra.getImeXIgraca() + "!");
        } else if (igra.pobednikO()) {
            System.out.println("Cestitamo! Pobednik je igrac O!");
            System.out.println("Bravo " + igra.getImeOIgraca() + "!");
        }
    }
}
