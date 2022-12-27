package p27_12_2022;

public class SlackMessage {

    public String imeIPrezime;

    public String timestamp;

    public String tekst;

    public void stampajPoruku(){
        System.out.println(this.imeIPrezime + " - " + this.timestamp);
        System.out.println(this.tekst);
    }

}
