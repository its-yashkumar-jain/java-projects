class Student {
    String name = "Mj";
    int roll = 43, marks = 84;
}

class MyRecord extends Student {
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll no.: " + roll);
        System.out.println("Percentage: " + marks + "%");
    }
}

public class studentRecord {
    public static void main(String[] args) {
        MyRecord r = new MyRecord();
        r.display();
    }
}
