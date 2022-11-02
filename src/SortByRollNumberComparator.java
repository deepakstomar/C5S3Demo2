import java.util.Comparator;

public class SortByRollNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getRollNumber() == o2.getRollNumber()){
            return 0;
        }

        if (o1.getRollNumber() < o2.getRollNumber()){
            return -1;
        }

        return 1;
    }
}
