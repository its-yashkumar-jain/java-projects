import java.util.Scanner;

class Point {
    double x, y;
    private Scanner sc = new Scanner(System.in);

    Point() {
        System.out.print("point (X,Y): ");
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

abstract class Figure {
    abstract void display();
}

class Open extends Figure {
    Open() {
        System.out.println("\nOpen figure selected!");
    }

    void display() {
        System.out.println("Open figure!\n");
    }
}

class Line extends Open {
    Point start, end;

    Line(Point s, Point e) {
        this.start = s;
        this.end = e;
    }

    void display() {
        System.out.println("\nLine figure:");
        System.out.println("Starting point: (" + start.x + "," + start.y + ")");
        System.out.println("Ending point: (" + end.x + "," + end.y + ")\n");
    }
}

class PolyLine extends Open {
    void display() {
        System.out.println("PolyLine figure!\n");
    }
}

class Close extends Figure {
    Close() {
        System.out.println("\nClose figure selected!");
    }

    void display() {
        System.out.println("Close figure!\n");
    }
}

class Polygon extends Close {
    void display() {
        System.out.println("Polygon figure!\n");
    }
}

class Eclipse extends Close {
    void display() {
        System.out.println("Eclipse figure!\n");
    }
}

public class GraphicsShape {
    public static void main(String[] args) {

        System.out.print("\nChoose your Figure type:\n1. Open\n2. Close\nYour input: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        if (inp == 1) {

            Open shape;
            System.out.print("\nChoose your shape type:\n1. Line\n2. PolyLine\nYour input: ");
            int shapeInp = sc.nextInt();

            if (shapeInp == 1) {
                System.out.print("\nEnter line starting ");
                Point p1 = new Point();
                System.out.print("\nEnter line ending ");
                Point p2 = new Point();
                shape = new Line(p1, p2);
            } else {
                shape = new PolyLine();
            }
            shape.display();

        } else {

            Close shape;
            System.out.print("\nChoose your shape type:\n1. Polygon\n2. Eclipse\nYour input: ");
            int shapeInp = sc.nextInt();

            if (shapeInp == 1) {
                shape = new Polygon();
            } else {
                shape = new Eclipse();
            }
            shape.display();

        }
        sc.close();
    }
}
