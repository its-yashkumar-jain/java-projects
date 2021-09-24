interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("\nDrawing shape: Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("\nDrawing shape: Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("\nDrawing shape: Rectangle");
    }
}

class ShapeFactory {

    public static Shape getShape(String s) {
        if (s.toLowerCase().equals("circle")) {
            return new Circle();
        }
        if (s.toLowerCase().equals("rectangle")) {
            return new Rectangle();
        }
        if (s.toLowerCase().equals("square")) {
            return new Square();
        }
        return null;
    }
}

interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling color: Red\n");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Filling color: Green\n");
    }
}

class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling color: Blue\n");
    }
}

class ColorFactory {

    public static Color getColor(String s) {
        if (s.toLowerCase().equals("red")) {
            return new Red();
        }
        if (s.toLowerCase().equals("green")) {
            return new Green();
        }
        if (s.toLowerCase().equals("blue")) {
            return new Blue();
        }
        return null;
    }
}

class Factory {
    Shape s;
    Color c;

    Factory(String s, String c) {
        this.s = ShapeFactory.getShape(s);
        this.c = ColorFactory.getColor(c);
    }

    void makeShape() {
        s.draw();
        c.fill();
    }
}

class FactoryProducer {
    public static Factory getFactory(String s, String c) {
        return new Factory(s, c);
    }
}

public class lvl2 {
    public static void main(String[] args) throws Exception {
        Factory f = FactoryProducer.getFactory("square", "blue");
        f.makeShape();

        Factory f1 = FactoryProducer.getFactory("circle", "red");
        f1.makeShape();
    }
}
