class student {
    void printName(String name) {
        System.out.println("Name is : " + name);
    }

    void printName() {
        System.out.println("Name is : Unknown");
    }
}

public class myClass {
    public static void main(String[] args) {
        student s1 = new student();
        s1.printName();
        s1.printName("MJ");
    }
}
