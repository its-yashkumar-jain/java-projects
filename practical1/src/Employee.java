import java.util.Scanner;

public class Employee {
    int salary, hoursOfWork;

    void getInfo(int salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    void addSal() {
        if (this.salary < 500) {
            this.salary += 10;
        }
    }

    void addWork() {
        if (this.hoursOfWork > 6) {
            this.salary += 5;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee salary : ");
        ;
        int salary = sc.nextInt();

        System.out.print("Enter Employee work hours : ");
        ;
        int hrs = sc.nextInt();

        Employee e1 = new Employee();
        e1.getInfo(salary, hrs);
        e1.addSal();
        e1.addWork();

        System.out.println("Final salary : " + e1.salary);

        sc.close();
    }
}
