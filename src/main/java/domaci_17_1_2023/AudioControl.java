package domaci_17_1_2023;

public class AudioControl extends Control{

    private boolean pojacavaTrueStisavaFalse;

    public boolean isPojacavaTrueStisavaFalse() {
        return pojacavaTrueStisavaFalse;
    }

    public void setPojacavaTrueStisavaFalse(boolean pojacavaTrueStisavaFalse) {
        this.pojacavaTrueStisavaFalse = pojacavaTrueStisavaFalse;
    }

    public AudioControl(boolean pojacavaTrueStisavaFalse) {
        this.pojacavaTrueStisavaFalse = pojacavaTrueStisavaFalse;
    }

    public AudioControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if(this.pojacavaTrueStisavaFalse){
            if(videoPlayer.getJacinaZvuka()+1>100){
                videoPlayer.setJacinaZvuka(100);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()+1);
            }
        } else {
            if(videoPlayer.getJacinaZvuka()-1<0){
                videoPlayer.setJacinaZvuka(0);
            } else {
                videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka()-1);
            }
        }
    }
}
