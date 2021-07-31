class Member {
    String name, phone, address;
    int age;
    double salary;

    void printSalary() {
        System.out.println("Salary is : " + this.salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class company {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "John";
        e1.age = 32;
        e1.phone = "3722041523";
        e1.address = "404 abc building";
        e1.salary = 23456.56;
        e1.specialization = "micro-biology";
        e1.printSalary();

        Manager m1 = new Manager();
        m1.name = "Mark";
        m1.age = 33;
        m1.phone = "3725541523";
        m1.address = "403 abc building";
        m1.salary = 234576.56;
        m1.department = "HR";
        m1.printSalary();
        System.out.println("Data added");
    }
}
