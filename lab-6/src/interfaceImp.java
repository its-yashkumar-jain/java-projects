interface interfaceFunc {
    void isOdd(int num);
}

interface interfaceFunc1 {
    void is15Odd();
}

interface interfaceFunc2 {
    void areTwoNumOdd(int num1, int num2);
}

class interface1 implements interfaceFunc {
    interface1() {
        System.out.println("\nInterface implementation through class!");
    }

    public void isOdd(int num) {
        if (num % 2 == 1) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }
}

public class interfaceImp {
    public static void main(String[] args) {
        interface1 m1 = new interface1();
        m1.isOdd(15);

        interfaceFunc m2 = new interfaceFunc() {
            public void isOdd(int num) {
                System.out.println("\n\nInterface implementation through anonymous class!");
                if (num % 2 == 1) {
                    System.out.println(num + " is odd");
                } else {
                    System.out.println(num + " is even");
                }
            }
        };
        m2.isOdd(20);

        interfaceFunc m3 = (num) -> {
            System.out.println("\n\nInterface implementation through lambda with parameter !");
            if (num % 2 == 1) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");
            }

        };
        m3.isOdd(21);

        interfaceFunc1 m4 = () -> {
            System.out.println("\n\nInterface implementation through lambda without parameter !");
            int num = 15;
            if (num % 2 == 1) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");
            }

        };
        m4.is15Odd();

        interfaceFunc2 m5 = (num1, num2) -> {
            System.out.println("\n\nInterface implementation through lambda with multiple parameter !");
            if (num1 % 2 == 1 && num2 % 2 == 1) {
                System.out.println(num1 + " and " + num2 + " are odd");
            } else {
                System.out.println("Either " + num1 + " or " + num2 + " is even");
            }

        };
        m5.areTwoNumOdd(11, 13);

    }
}
