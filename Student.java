package Person;

public class Student extends Human {
    private String vuz;
    private int kurs ;

    public  Student(String name, int age, char gen,String vuz,int kurs) {
        super(name,age,gen);
        this.vuz = vuz ;
        this.kurs = kurs;
    }
    public  Student(){
        super();
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setVuz(String vuz) {
        this.vuz = vuz;
    }

    public int getKurs() {
        return kurs;
    }

    public String getVuz() {
        return vuz;
    }

    @Override
    public String toString(){
        return " Имя " +super.getName()+ " возраст " +super.getAge() +" пол "+super.getGen() + " ВУЗ "+vuz+" курс "+kurs;

    }
}
