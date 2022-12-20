package p20_12_2022;

import java.util.Scanner;

public class Zadatak5ZaVezbanje {
    public static void main(String[] args) {

//        (za vezbanje) Napisati pogram koji vrsi korkeciju zvuka.
//        Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”. Program radi dok korisnik ne unese play.
//        Inicijalna jacina zvuka je 75.
//        Pojacaj - akcije koja povecava jacinu zvuka za 10
//        smanji - akcija koja smajnjuje jacinu zvuka za 10.
//        Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//        Na kraju programa odstampati jacinu zvuka.
//
//        Primer izvrsenja:
//        Unesite akciju: pojacaj (iz 75 u 85)
//        Unesite akciju: pojacaj ( iz 85 u 95)
//        Unesite akciju: pojacaj (iz 95 u 100)
//        Unesite akciju: smanji (iz 100 u 90)
//        Unesite akciju: smanji (iz 90 u 80)
//        Unesite akciju: play
//        Jacina zvuka je 80.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite akciju (pojacaj, smanji, play: ");
        String akcija = s.next();

        int jacina = 75;

        while(!akcija.equals("play")){
            if(akcija.equals("pojacaj")){
                jacina = jacina+10;
            }
            if (akcija.equals("smanji")){
                jacina = jacina-10;
            }
            if (jacina>100){
                jacina=100;
            }
            if(jacina<0){
                jacina=0;
            }
            System.out.println("Unesite akciju (pojacaj, smanji, play): ");
            akcija = s.next();
        }
        System.out.println("Jacina zvuka je " + jacina);
    }
}
