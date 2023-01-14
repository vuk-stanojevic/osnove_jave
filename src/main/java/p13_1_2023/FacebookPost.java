package p13_1_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezime;
    private String tekst;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imePrezime, String tekst) {
        this.imePrezime = imePrezime;
        this.tekst = tekst;
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija){
        this.reakcije.add(reakcija);
    }

    private int brojReakcija(String tip) {
        int brojac = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTip().equals(tip)) {
                brojac++;
            }
        }
        return brojac;
    }

    public void stampaj(){
        System.out.println(this.imePrezime);
        System.out.println(this.tekst);
        System.out.println("Smajli " + this.brojReakcija("smajli") + " | Like " + this.brojReakcija("like") + " | Srce " + this.brojReakcija("srce"));
    }
}
