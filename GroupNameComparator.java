package Person;

import java.util.Comparator;
import java.lang.NullPointerException;

import static java.lang.System.out;

public class GroupNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Group a = (Group) o1;
        Group b = (Group) o2;
        String firstName =((Group) a).getName();
        String secondName =((Group) b).getName();

        try {
            if (firstName.compareTo(secondName) > 0) {
                return 1;
            }

            if (firstName.compareTo(secondName) < 0) {
                return -1;
            }

        } catch (Exception e) {
            out.println(" Метод не вызван");
        }
        return 0;
    }
}
