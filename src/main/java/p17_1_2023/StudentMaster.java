package p17_1_2023;

public class StudentMaster extends Student{

    public StudentMaster(String ime, String prezime, int indeks, int godinaStudija) {
        super(ime, prezime, indeks, godinaStudija);
    }

    @Override
    public int cenaSkolarine(){
        return 100000;
    }

    @Override
    public boolean budzet(){
        if(this.godinaStudija<2){
            return true;
        } else {
            return false;
        }
    }
}
