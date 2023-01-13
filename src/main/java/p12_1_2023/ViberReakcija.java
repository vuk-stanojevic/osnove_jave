package p12_1_2023;

public class ViberReakcija {

    private String emoji;

    private ViberKorisnik koJeReagovao;


    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getKoJeReagovao() {
        return koJeReagovao;
    }

    public void setKoJeReagovao(ViberKorisnik koJeReagovao) {
        this.koJeReagovao = koJeReagovao;
    }


    public ViberReakcija(String emoji, ViberKorisnik koJeReagovao) {
        this.emoji = emoji;
        this.koJeReagovao = koJeReagovao;
    }
}
