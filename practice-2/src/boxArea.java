class Rectangle {
    Double length, width;

    Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of the rectangle is: " + this.length * this.width);
    }
}

class Box extends Rectangle {
    Double depth;

    Box(Double length, Double width, double depth) {
        super(length, width);
        this.depth = depth;
    }

    void area() {
        System.out.println("Area of the box is: " + this.length * this.width * this.depth);
    }
}

public class boxArea {
    public static void main(String[] args) {
        Box b = new Box(10.1, 20.0, 30);
        b.area();
    }
}
