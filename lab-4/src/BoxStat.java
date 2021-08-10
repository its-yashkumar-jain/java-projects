class Box {
    double height, width, depth;
    static int count = 0;
    int boxNum = 0;

    Box() {
        count++;
        this.height = 1;
        this.width = 1;
        this.depth = 1;
        this.boxNum = count;
    }

    Box(double h, double w, double d) {
        count++;
        this.height = h;
        this.width = w;
        this.depth = d;
        this.boxNum = count;
    }

    static double Area(double h, double w, double d) {
        return 2 * h * w + 2 * d * h + 2 * d * w;
    }

    static void displayCount() {
        System.out.println("\nNumber of boxes: " + count + "\n");
    }

    void display() {
        System.out.println("\nBox " + this.boxNum + " dimensions:");
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Depth: " + this.depth);
        System.out.println("Surface area: " + Area(this.height, this.width, this.depth));
        System.out.println("Number of boxes: " + count);
    }
}

public class BoxStat {
    public static void main(String[] args) {
        // box 1
        Box b1 = new Box();
        b1.display();
        // box 2
        Box b2 = new Box(10, 1, 20);
        b2.display();

        // calling static methods
        System.out.println("\nArea of (10, 10, 10): " + Box.Area(10, 10, 10));
        Box.displayCount();
    }
}
