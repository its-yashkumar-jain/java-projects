import java.util.Scanner;

class InvalidDepartment extends Exception {
    public InvalidDepartment(String msg) {
        super(msg);
    }
}

class InvalidID extends Exception {
    public InvalidID(String msg) {
        super(msg);
    }
}

class InvalidIdFormat extends Exception {
    public InvalidIdFormat(String msg) {
        super(msg);
    }
}

class Employee {
    String name, ID;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee name: ");
        this.name = sc.nextLine().toLowerCase();
        this.name = this.name.substring(0, 1).toUpperCase() + this.name.substring(1);

        System.out.print("Enter Employee ID: ");
        this.ID = sc.nextLine().toUpperCase();
    }

    void validateID() throws Exception {
        String department = this.ID.substring(0, 2);
        int id = Integer.parseInt(this.ID.substring(2, 5));

        if (this.ID.length() > 5) {
            throw new InvalidIdFormat("incorrect ID format");
        }

        if (!department.equals("CS") && !department.equals("IT") && !department.equals("EC")) {
            throw new InvalidDepartment("incorrect department");
        }

        if (id > 50 || id < 1) {
            throw new InvalidID("incorrect ID");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n----- Employee Directory -----\n");

        Scanner sc = new Scanner(System.in);

        int inp = 0, arrIndex = 0;
        Employee[] arr = new Employee[100];
        do {
            System.out.println("\nEnter choice: ");
            System.out.println("1. Enter employee data");
            System.out.println("2. Show all employee");
            System.out.println("3. Exit");
            System.out.print("Your input: ");

            inp = sc.nextInt();
            System.out.println("");

            switch (inp) {
                case 1:
                    arr[arrIndex] = new Employee();
                    arr[arrIndex].getData();
                    try {
                        arr[arrIndex].validateID();
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Data not added!");
                        arrIndex--;
                    }
                    arrIndex++;

                    break;
                case 2:
                    System.out.println("\n----- Employee Board -----\n");
                    for (int i = 0; i < arrIndex; i++) {
                        System.out.println("\nEmployee no.: " + (i + 1));
                        System.out.println("Name: " + arr[i].name);
                        System.out.println("ID: " + arr[i].ID);
                    }
                    break;
                case 3:
                    System.out.println("\nExit confirmed!!!\n");
                    break;
                default:
                    System.out.println("Invalid Input\n");
            }

        } while (inp != 3);
        sc.close();
    }
}
