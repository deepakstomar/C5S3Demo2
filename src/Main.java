import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Ronnie", "O'sullivan", 2),
                new Student("A", "B", 1),
                new Student("Prakash", "Rahul", 2));

        printList(studentList);

        System.out.println("Sorted by Roll Number:");
        Collections.sort(studentList, new SortByRollNumberComparator());
        printList(studentList);
        System.out.println("Sorted by First Name:");
        Collections.sort(studentList, new SortByFirstNameComparator());
        printList(studentList);

    }

    private static void printList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------------");
    }
}
