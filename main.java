package Person;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        char[] genders = {'м', 'ж'};
        Group[] array = new Group[10];
        array[0] = new Group("aHuman1",21, genders[0],"VUZ",3,3);
        array[1] =new Group("dHuman2",20, genders[0],"VUZ",3,3);
        array[2]=new Group("cHuman3",16, genders[1],"VUZ",1,2);
        array[3]=new Group("bHuman4",22, genders[0],"VUZ",5,5);
        array[4]=new Group("eHuman5",18, genders[0],"VUZ",2,2);
        array[5]=new Group("fHuman6",17, genders[1],"VUZ",1,1);
        array[6]=new Group("gHuman7",19, genders[0],"VUZ",3,2);
        array[7]=new Group("jHuman8",20, genders[1],"VUZ",2,7);
        array[8]=new Group("iHuman9",23, genders[0],"VUZ",4,2);
        array[9]=new Group("hHuman10",22, genders[1],"VUZ",4,2);

        Arrays.sort(array,new GroupNameComparator());
        for (Group x:array
        ) {
            System.out.println(x);
        }


    }

}
