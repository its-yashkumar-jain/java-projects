import java.util.Scanner;

public class area {
    double length, breadth;

    area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double returnArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth : ");
        double b = sc.nextDouble();

        area a = new area(l, b);
        System.out.println("Area of the rectangle : " + a.returnArea());

        sc.close();
    }
}
