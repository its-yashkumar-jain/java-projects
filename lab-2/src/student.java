public class student {
    String name;
    int roll_no;

    student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void printData() {
        System.out.println("Student's name : " + this.name);
        System.out.println("Student's roll no.: " + this.roll_no);
    }
}
