interface taxable {
    void calculateTax();
}

class Employee {
    String name, id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Permanent extends Employee implements taxable {
    double salary, additionalEarning, tax = 0;

    Permanent(String name, String id, double salary, double additionalEarning) {
        super(name, id);
        this.additionalEarning = additionalEarning;
        this.salary = salary + additionalEarning;
    }

    public void calculateTax() {
        if (salary > 100000 && salary < 500000) {
            tax = salary * 0.1;
        } else if (salary > 500000) {
            tax = salary * 0.2;
        } else {
            tax = 0;
        }
    }

    void displayData() {
        System.out.println("\nEmployee type: Permanent");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee id: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Tax: " + this.tax);
    }
}

class HourlyEmployee extends Employee {
    double hoursWorked, ratePerHour, salary, tax;

    HourlyEmployee(String name, String id, double hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
        this.salary = hoursWorked * ratePerHour;
    }

    public void calculateTax() {
        if (salary > 100000 && salary < 500000) {
            tax = salary * 0.1;
        } else if (salary > 500000) {
            tax = salary * 0.2;
        } else {
            tax = 0;
        }
    }

    void displayData() {
        System.out.println("\nEmployee type: Hourly");
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee id: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Tax: " + this.tax + "\n");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Permanent p = new Permanent("Madhav", "567", 523456, 5678);
        p.calculateTax();
        p.displayData();
        HourlyEmployee h = new HourlyEmployee("Mj", "67", 45, 10000);
        h.calculateTax();
        h.displayData();
    }
}
