import java.util.Scanner;

class Account {
    protected double balance, fd, charges, withdrawalLimit, withdraws;

    Account() {
        this.balance = 0;
        this.fd = 0;
        this.charges = 0;
        this.withdrawalLimit = 0;
        this.withdraws = 0;
    }

    void getBalance() {
        System.out.println("Your balance is : " + this.balance);
    }

    void getFD() {
        System.out.println("Your fixed deposit balance is : " + this.fd);
    }

    void depositToBalance(double amt) {
        if (amt < 0) {
            System.out.println("ERROR : Money amount cannot be negative!");
        } else {
            this.balance += amt;
            System.out.println("Updated balance : " + this.balance);
        }
    }

    void depositToFD(double amt) {
        if (amt < 0) {
            System.out.println("ERROR : Money amount cannot be negative!");
        } else {
            this.fd += amt;
            System.out.println("Updated FD balance : " + this.fd);
        }
    }

    void withdraw(double amt) {
        if (amt < 0) {
            System.out.println("ERROR : Money amount cannot be negative!");
        } else if (this.withdraws > this.withdrawalLimit) {
            System.out.println("ERROR: You have exceeded today's withdrawal limit, try again later!");
        } else if (amt + this.charges > this.balance) {
            System.out.println("Your withdrawal amount : " + this.balance);
            this.balance = 0;
            this.withdraws++;
            this.getBalance();
        } else {
            System.out.println("Your withdrawal amount : " + amt);
            this.balance -= amt + this.charges;
            this.withdraws++;
            this.getBalance();
        }
    }

    void breakFD() {
        this.fd = 0;
        System.out.println("Amount received from FD : " + this.fd);
        this.getFD();
    }
}

class saving extends Account {
    saving() {
        this.charges = 10;
        this.withdrawalLimit = 10;
        this.withdraws = 0;
        System.out.println("You have successfully open a savings account! 👏👏");
    }
}

class current extends Account {
    current() {
        this.charges = 5;
        this.withdrawalLimit = 50;
        this.withdraws = 0;
        System.out.println("You have successfully open a current account! 👏👏");
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n----------------------------");
        System.out.println("Welcome to RCOEM bank 🏦💰💰");
        System.out.println("----------------------------\n\n");

        System.out.println("What type of account do you want to open ?");
        System.out.println("1. Savings \n2. Current");
        System.out.print("Enter your choice : ");
        int opt = sc.nextInt();

        Account c1 = new Account();
        if (opt == 1) {
            c1 = new saving();
        } else {
            c1 = new current();
        }

        int actionCount = 1;
        while (actionCount == 1) {
            System.out.println("\nWhat action do you want to perform ?");
            System.out.println("1. Know your balance");
            System.out.println("2. Know your FD balance");
            System.out.println("3. Deposit money to account");
            System.out.println("4. Deposit money to FD");
            System.out.println("5. Withdraw money");
            System.out.println("6. Break FD");
            System.out.print("Enter choice value : ");
            int inp = sc.nextInt();

            switch (inp) {
                case 1:
                    c1.getBalance();
                    break;
                case 2:
                    c1.getFD();
                    break;
                case 3:
                    System.out.print("Enter deposit amount : ");
                    Double amt = sc.nextDouble();
                    c1.depositToBalance(amt);
                    break;
                case 4:
                    System.out.print("Enter deposit amount : ");
                    amt = sc.nextDouble();
                    c1.depositToFD(amt);
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount : ");
                    amt = sc.nextDouble();
                    c1.withdraw(amt);
                    break;
                case 6:
                    c1.breakFD();
                    break;

                default:
                    System.out.println("ERROR : Invalid choice");
                    break;
            }

            System.out.print("\nDo you want to continue ? \nEnter 1 for yes, 0 for no : ");
            actionCount = sc.nextInt();
        }

        sc.close();
    }
}
