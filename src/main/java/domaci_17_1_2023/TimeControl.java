package domaci_17_1_2023;

public class TimeControl extends Control{

    private boolean naKojuStranu;

    public TimeControl(boolean naKojuStranu) {
        this.naKojuStranu = naKojuStranu;
    }

    public TimeControl() {
    }

        @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if(this.naKojuStranu){
            if(videoPlayer.getTrenutnoVremeVidea()+15>videoPlayer.getDuzinaVidea()){
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
            } else {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()+15);
            }
        } else {
            if (videoPlayer.getTrenutnoVremeVidea() - 15 < 0) {
                videoPlayer.setTrenutnoVremeVidea(0);
            } else {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea() - 15);
            }
        }
    }
}
