class OS {
    void feature() {
        System.out.println("\nFrom parent OS");
    }

    static void displayInfo() {
        System.out.println("Hi this is static from OS");
    }
}

class DOS extends OS {
    void feature() {
        System.out.println("\nFrom DOS it's parent OS");
    }

    static void displayInfo() {
        System.out.println("Hi this is static from DOS");
    }
}

class Windows extends DOS {
    void feature() {
        System.out.println("\nFrom Windows it's parent DOS");
    }

    static void displayInfo() {
        System.out.println("Hi this is static from Windows");
    }
}

class WindowsMobile extends Windows {
    void feature() {
        System.out.println("\nFrom WindowsMobile it's parent Windows");
    }

    static void displayInfo() {
        System.out.println("Hi this is static from WindowsMobile");
    }
}

public class multiInheritance {
    public static void main(String[] args) {
        OS temp = new OS();
        temp.feature();
        OS.displayInfo();

        temp = new DOS();
        temp.feature();
        DOS.displayInfo();

        temp = new Windows();
        temp.feature();
        Windows.displayInfo();

        temp = new WindowsMobile();
        temp.feature();
        WindowsMobile.displayInfo();
    }
}
