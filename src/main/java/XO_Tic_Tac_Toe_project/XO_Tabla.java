package XO_Tic_Tac_Toe_project;

public class XO_Tabla {

    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;

    private String imeXIgraca;
    private String imeOIgraca;

    private String naPotezu;

    public String getImeXIgraca(){
        return this.imeXIgraca;
    }

    public void setImeXIgraca(String ixi){
        this.imeXIgraca = ixi;
    }

    public String getImeOIgraca(){
        return this.imeOIgraca;
    }

    public void setImeOIgraca(String ioi){
        this.imeOIgraca = ioi;
    }

    public String getNaPotezu(){
        return this.naPotezu;
    }

    public void pokreniIgru(){
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
    }

    public void stampaj(){
        System.out.println("\t\t\t\t " + this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " ");
        System.out.println("\t\t\t\t " + this.polje4 + " | " + this.polje5 + " | " + this.polje6 + " ");
        System.out.println("\t\t\t\t " + this.polje7 + " | " + this.polje8 + " | " + this.polje9 + " ");
        System.out.println("Igrac X: " + this.imeXIgraca);
        System.out.println("Igrac O: " + this.imeOIgraca);
        System.out.println();
    }

//    public boolean poljePrazno(int indeksPolja){
//        if(indeksPolja==1){
//            return polje1.equals(" ");
//        } else if(indeksPolja==2){
//            return polje2.equals(" ");
//        } else if(indeksPolja==3){
//            return polje3.equals(" ");
//        } else if(indeksPolja==4){
//            return polje4.equals(" ");
//        } else if(indeksPolja==5){
//            return polje5.equals(" ");
//        } else if(indeksPolja==6){
//            return polje6.equals(" ");
//        } else if(indeksPolja==7){
//            return polje7.equals(" ");
//        } else if(indeksPolja==8){
//            return polje8.equals(" ");
//        } else if(indeksPolja==9){
//            return polje9.equals(" ");
//        } else {
//            return false;
//        }
//    }

    public boolean poljePrazno(int indeksPolja){
        return (indeksPolja==1 && polje1.equals(" ") ||
                indeksPolja==2 && polje2.equals(" ") ||
                indeksPolja==3 && polje3.equals(" ") ||
                indeksPolja==4 && polje4.equals(" ") ||
                indeksPolja==5 && polje5.equals(" ") ||
                indeksPolja==6 && polje6.equals(" ") ||
                indeksPolja==7 && polje7.equals(" ") ||
                indeksPolja==8 && polje8.equals(" ") ||
                indeksPolja==9 && polje9.equals(" "));
    }

//    public boolean poljePrazno(int indeksPolja){
//        if(indeksPolja==1 && polje1.equals(" ")){
//            return true;
//        } else if(indeksPolja==2 && polje2.equals(" ")){
//            return true;
//        } else if(indeksPolja==3 && polje3.equals(" ")){
//            return true;
//        } else if(indeksPolja==4 && polje4.equals(" ")){
//            return true;
//        } else if(indeksPolja==5 && polje5.equals(" ")){
//            return true;
//        } else if(indeksPolja==6 && polje6.equals(" ")){
//            return true;
//        } else if(indeksPolja==7 && polje7.equals(" ")){
//            return true;
//        } else if(indeksPolja==8 && polje8.equals(" ")){
//            return true;
//        } else if(indeksPolja==9 && polje9.equals(" ")){
//            return true;
//        }
//        return false;
//    }

//    public boolean poljePrazno(int indeksPolja){
//        boolean prazno = false;
//        if(indeksPolja==1){
//            prazno = polje1.equals(" ");
//        } else if(indeksPolja==2){
//            prazno = polje2.equals(" ");
//        } else if(indeksPolja==3){
//            prazno = polje3.equals(" ");
//        } else if(indeksPolja==4){
//            prazno = polje4.equals(" ");
//        } else if(indeksPolja==5){
//            prazno = polje5.equals(" ");
//        } else if(indeksPolja==6){
//            prazno = polje6.equals(" ");
//        } else if(indeksPolja==7){
//            prazno = polje7.equals(" ");
//        } else if(indeksPolja==8){
//            prazno = polje8.equals(" ");
//        } else if(indeksPolja==9){
//            prazno = polje9.equals(" ");
//        }
//        return prazno;
//    }

    public void zameniIgraca(){
        if(this.naPotezu.equals("X")){
            this.naPotezu = "O";
        }else if(this.naPotezu.equals("O")){
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int indeksPolja){
        if(indeksPolja==1){
            polje1=this.naPotezu;
        } else if(indeksPolja==2){
            polje2=this.naPotezu;
        } else if(indeksPolja==3){
            polje3=this.naPotezu;
        } else if(indeksPolja==4){
            polje4=this.naPotezu;
        } else if(indeksPolja==5){
            polje5=this.naPotezu;
        } else if(indeksPolja==6){
            polje6=this.naPotezu;
        } else if(indeksPolja==7){
            polje7=this.naPotezu;
        } else if(indeksPolja==8){
            polje8=this.naPotezu;
        } else if(indeksPolja==9){
            polje9=this.naPotezu;
        }
    }

    public boolean popunjenaTabla(){
        return (!this.polje1.equals(" ") &&
                !this.polje2.equals(" ") &&
                !this.polje3.equals(" ") &&
                !this.polje4.equals(" ") &&
                !this.polje5.equals(" ") &&
                !this.polje6.equals(" ") &&
                !this.polje7.equals(" ") &&
                !this.polje8.equals(" ") &&
                !this.polje9.equals(" "));
    }

    public boolean pobednikX(){
        return (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X") ||
               this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X") ||
               this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X") ||
               this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X") ||
               this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X") ||
               this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X") ||
               this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X") ||
               this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X"));
    }

    public boolean pobednikO(){
        return (this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O") ||
                this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O") ||
                this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O") ||
                this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O") ||
                this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O") ||
                this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O") ||
                this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O") ||
                this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O"));
    }
}
