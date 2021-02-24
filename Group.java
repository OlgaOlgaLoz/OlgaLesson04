package Person;

public class Group extends Student {
     private int group;

    public Group(String name, int age, char gen,String vuz,int kurs,int group) {
        super(name,age,gen,vuz,kurs);
        this.group = group;
    }
    public  Group(){
        super();
    }

    public void setGroup(int group) {
        this.group = group;
    }
    public int getGroup() {
        return group;
    }
    @Override
    public String toString(){
    return " Имя " +super.getName()+ " возраст " +super.getAge() +" пол "+super.getGen() + " ВУЗ "+super.getVuz()+" курс "+super.getKurs()+" группа "+group;

    }
}
