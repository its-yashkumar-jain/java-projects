class parent {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class child extends parent {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class parentChild {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();

        // a. - method of parent class by object of parent class
        p.printParent();

        // b. - method of child class by object of child class
        c.printChild();

        // c - method of parent class by object of child class
        c.printParent();

    }
}
