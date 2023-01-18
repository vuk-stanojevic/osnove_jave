package domaci_17_1_2023;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if(this.brzinaInterneta*10.1<144){
            videoPlayer.setKvalitetVidea(144);
        } else if(this.brzinaInterneta*10.1<240){
            videoPlayer.setKvalitetVidea(240);
        } else if(this.brzinaInterneta*10.1<360){
            videoPlayer.setKvalitetVidea(360);
        } else if(this.brzinaInterneta*10.1<480){
            videoPlayer.setKvalitetVidea(480);
        } else if(this.brzinaInterneta*10.1<720){
            videoPlayer.setKvalitetVidea(720);
        } else {
            videoPlayer.setKvalitetVidea(1080);
        }
    }
}
