import java.util.Scanner;

public class complex {
    double real, imag;

    complex() {
        this.real = 0;
        this.imag = 0;
    }

    complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    void printComplex() {
        System.out.println("Complex number : " + this.real + " + (" + this.imag + "i)");
    }

    static complex addComplex(complex c1, complex c2) {
        complex temp = new complex();
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;
        return temp;
    }

    static complex subtractComplex(complex c1, complex c2) {
        complex temp = new complex();
        temp.real = c1.real - c2.real;
        temp.imag = c1.imag - c2.imag;
        return temp;
    }

    static complex multiComplex(complex c1, complex c2) {
        double a, b, c, d;
        a = c1.real;
        b = c1.imag;
        c = c2.real;
        d = c2.imag;
        complex temp = new complex();
        temp.real = (a * c - b * d);
        temp.imag = (a * d + b * c);
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter first complex number");
        System.out.print("Enter real value : ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary value : ");
        double imag1 = sc.nextDouble();

        complex c1 = new complex(real1, imag1);
        c1.printComplex();

        System.out.println("\nEnter second complex number");
        System.out.print("Enter real value : ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary value : ");
        double imag2 = sc.nextDouble();

        complex c2 = new complex(real2, imag2);
        c2.printComplex();

        complex sum = new complex();
        sum = addComplex(c1, c2);
        System.out.println("\nSum of c1 and c2 : ");
        sum.printComplex();

        complex sub = new complex();
        sub = subtractComplex(c1, c2);
        System.out.println("\nSubtraction of c1 and c2 : ");
        sub.printComplex();

        complex mul = new complex();
        mul = multiComplex(c1, c2);
        System.out.println("\nMultiplication of c1 and c2 : ");
        mul.printComplex();

        sc.close();
    }
}
