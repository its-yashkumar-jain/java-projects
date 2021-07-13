public class triangle {

    int a, b, c;

    void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void printPerimeter() {
        int perimeter = this.a + this.b + this.c;
        System.out.println("Perimeter of the triangle is : " + perimeter);
    }

    void printArea() {
        int perimeter = this.a + this.b + this.c;
        int s = perimeter / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle is : " + area);
    }

    public static void main(String[] args) {
        triangle t = new triangle();
        t.setData(3, 4, 5);
        t.printPerimeter();
        t.printArea();
    }
}
