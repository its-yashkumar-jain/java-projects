class RBI {
    void getInterest() {
        System.out.println("The standard interest rate for all banks is 4%");
    }
}

class SBI extends RBI {
    @Override
    void getInterest() {
        System.out.println("The standard interest rate for SBI banks is 5%");
    }

    void displayInfo() {
        System.out.println("SBI was founded in 1955");
    }

    void displayInfo(int a) {
        System.out.println("You are a customer since 12years!!");
    }
}

class ICICI extends RBI {
    @Override
    void getInterest() {
        System.out.println("The standard interest rate for ICICI banks is 6%");
    }

    void displayInfo() {
        System.out.println("ICICI was founded in 1994");
    }

    void displayInfo(int a) {
        System.out.println("You are a customer since 8years!!");
    }
}

class AXIS extends RBI {
    @Override
    void getInterest() {
        System.out.println("The standard interest rate for AXIS banks is 4%");
    }

    void displayInfo() {
        System.out.println("AXIS was founded in 2004");
    }

    void displayInfo(int a) {
        System.out.println("You are a customer since 4years!!");
    }
}

public class App {
    public static void main(String[] args) {
        AXIS a1 = new AXIS();
        a1.getInterest();
        a1.displayInfo();
        a1.displayInfo(5);
    }
}
