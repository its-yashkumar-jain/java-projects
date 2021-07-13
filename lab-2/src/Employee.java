public class Employee {
    String name, address;
    int yrs, salary;

    Employee(String name, int yrs, String address, int salary) {
        this.name = name;
        this.yrs = yrs;
        this.salary = salary;
        this.address = address;
    }

    void printEmployeeData() {
        System.out.println(this.name + "\t\t" + this.yrs + "\t\t\t" + this.address);
    }

    public static void main(String[] args) {
        System.out.println("\nName\t\tYear of joining\t\tAddress");
        Employee e1 = new Employee("Robert", 1994, "64C-WallStreet", 34567);
        e1.printEmployeeData();
        Employee e2 = new Employee("Sam", 2000, "68D-WallStreet", 345678);
        e2.printEmployeeData();
        Employee e3 = new Employee("John", 1999, "26B-WallStreet", 9876);
        e3.printEmployeeData();

        System.out.println();
    }
}
