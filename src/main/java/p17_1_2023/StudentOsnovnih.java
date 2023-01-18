package p17_1_2023;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String ime, String prezime, int indeks, int godinaStudija) {
        super(ime, prezime, indeks, godinaStudija);
    }

    @Override
    public int cenaSkolarine(){
        return 90000;
    }

    @Override
    public boolean budzet(){
        if(this.godinaStudija<5){
            return true;
        } else {
            return false;
        }
    }

}
