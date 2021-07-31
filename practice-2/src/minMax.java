import java.util.Scanner;

class Base {
    int a = 3, b = 2;

    Base() {
        System.out.print("\nEnter two number : ");
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        sc.close();
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("\nMax num is: " + dispMax());
        System.out.println("Min num is: " + dispMin() + "\n");
    }

    int dispMax() {
        return this.a > this.b ? this.a : this.b;
    }

    int dispMin() {
        return this.a < this.b ? this.a : this.b;
    }
}

public class minMax {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
