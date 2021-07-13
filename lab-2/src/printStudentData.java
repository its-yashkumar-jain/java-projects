public class printStudentData {

    String name;
    int roll_no;

    printStudentData(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void printData() {
        System.out.println("Student's name : " + this.name);
        System.out.println("Student's roll no.: " + this.roll_no);
    }

    public static void main(String[] args) {
        printStudentData a = new printStudentData("John", 2);
        a.printData();
    }

}
