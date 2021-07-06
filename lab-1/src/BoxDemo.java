class Box {
    double width;
    double height;
    double depth;

    Box() {
        height = 10;
        width = 20.2;
        depth = 13.3;
    }

    Box(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void volume() {
        System.out.println("Volume of the box 1 is : " + width * height * depth);
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 10, 10);
        myBox1.volume();

        Box myBox2 = new Box();
        myBox2.volume();

        Box myBox3 = new Box(12, 14, 10);
        myBox3.volume();

        Box myBox4 = new Box();
        myBox4.volume();
    }
}
