package domaci_12_1_2023;

public class ElektricniSporet {
    private String marka;

    private int garancija;

    private int maksUkljRingli;

    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maksUkljRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maksUkljRingli = maksUkljRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaksUkljRingli() {
        return maksUkljRingli;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

//    public void pojacaj(int pozicija){
//        int ukljucenih = 0;
//        if(this.goreLevo.ukljIsklj().equals("Ukljucena")){
//            ukljucenih++;
//        }
//        if(this.goreDesno.ukljIsklj().equals("Ukljucena")){
//            ukljucenih++;
//        }
//        if(this.doleLevo.ukljIsklj().equals("Ukljucena")){
//            ukljucenih++;
//        }
//        if(this.doleDesno.ukljIsklj().equals("Ukljucena")){
//            ukljucenih++;
//        }
//        if(ukljucenih>this.maksUkljRingli){
//            if(pozicija==1){
//                this.goreLevo.pojacajRinglu();
//                iskljuciRinglu(2);
//                iskljuciRinglu(3);
//                iskljuciRinglu(4);
//            } else if (pozicija==2){
//                this.goreDesno.pojacajRinglu();
//                iskljuciRinglu(1);
//                iskljuciRinglu(3);
//                iskljuciRinglu(4);
//            } else if(pozicija==3){
//                this.doleLevo.pojacajRinglu();
//                iskljuciRinglu(1);
//                iskljuciRinglu(2);
//                iskljuciRinglu(4);
//            } else {
//                this.doleDesno.pojacajRinglu();
//                iskljuciRinglu(1);
//                iskljuciRinglu(2);
//                iskljuciRinglu(3);
//            }
//        } else if(pozicija==1){
//            this.goreLevo.pojacajRinglu();
//        } else if(pozicija==2){
//            this.goreDesno.pojacajRinglu();
//        } else if(pozicija==3){
//            this.doleLevo.pojacajRinglu();
//        } else {
//            this.doleDesno.pojacajRinglu();
//        }
//    }

    public void pojacaj(int pozicija){
        if(pozicija==1){
            this.goreLevo.pojacajRinglu();
        } else if(pozicija==2){
            this.goreDesno.pojacajRinglu();
        } else if(pozicija==3){
            this.doleLevo.pojacajRinglu();
        } else {
            this.doleDesno.pojacajRinglu();
        }
        int ukljucenih = 0;
        if(this.goreLevo.ukljIsklj().equals("Ukljucena")){
            ukljucenih++;
        }
        if(this.goreDesno.ukljIsklj().equals("Ukljucena")){
            ukljucenih++;
        }
        if(this.doleLevo.ukljIsklj().equals("Ukljucena")){
            ukljucenih++;
        }
        if(this.doleDesno.ukljIsklj().equals("Ukljucena")){
            ukljucenih++;
        }
        if(ukljucenih>this.maksUkljRingli){
            if(pozicija==1){
                iskljuciRinglu(2);
                iskljuciRinglu(3);
                iskljuciRinglu(4);
            } else if (pozicija==2){
                iskljuciRinglu(1);
                iskljuciRinglu(3);
                iskljuciRinglu(4);
            } else if(pozicija==3){
                iskljuciRinglu(1);
                iskljuciRinglu(2);
                iskljuciRinglu(4);
            } else {
                iskljuciRinglu(1);
                iskljuciRinglu(2);
                iskljuciRinglu(3);
            }
        }
    }

    public void iskljuciRinglu(int pozicija){
        if(pozicija==1){
            this.goreLevo.iskljuciRinglu();
        }else if(pozicija==2){
            this.goreDesno.iskljuciRinglu();
        } else if(pozicija==3){
            this.doleLevo.iskljuciRinglu();
        } else {
            this.doleDesno.iskljuciRinglu();
        }
    }

    public double ukupnaPotrosnja(int vreme){
        return this.goreLevo.potrosnja(vreme)+this.goreDesno.potrosnja(vreme)+this.doleLevo.potrosnja(vreme)+this.doleDesno.potrosnja(vreme);
    }

    public void stampaj(){
        System.out.println(this.marka + " - " + this.garancija + " god. garancije");
        System.out.println("Ringle:");
        System.out.println("Gore levo:");
        this.goreLevo.stampaj();
        System.out.println("Gore desno:");
        this.goreDesno.stampaj();
        System.out.println("Dole levo:");
        this.doleLevo.stampaj();
        System.out.println("Dole desno:");
        this.doleDesno.stampaj();
    }
}
