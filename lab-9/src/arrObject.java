import java.util.*;

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll + "\n");
    }
}

class SortByRoll implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.roll - b.roll;
    }
}

public class arrObject {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();

        // adding students
        arr.add(new Student("Madhav", 43));
        arr.add(new Student("Jameson", 33));
        arr.add(new Student("Mark", 93));

        System.out.println("\nWithout sort: \n");
        Iterator<Student> i = arr.iterator();
        while (i.hasNext()) {
            i.next().print();
        }

        Collections.sort(arr, new SortByRoll());

        System.out.println("\nSort by roll: \n");
        Iterator<Student> j = arr.iterator();
        while (j.hasNext()) {
            j.next().print();
        }
    }
}
