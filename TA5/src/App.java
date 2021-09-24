
class distConverter<T1 extends Number> {
    Double km, miles, meter;

    distConverter(T1 num, String s) {
        if (s.toLowerCase().equals("km")) {
            this.kmTo(num);
        } else if (s.toLowerCase().equals("m")) {
            this.mTo(num);
        } else if (s.toLowerCase().equals("miles")) {
            this.milesTo(num);
        }
    }

    void kmTo(T1 num) {
        this.km = num.doubleValue();
        this.miles = num.doubleValue() * 0.621371;
        this.meter = num.doubleValue() * 1000;
    }

    void mTo(T1 num) {
        this.meter = num.doubleValue();
        this.km = num.doubleValue() / 1000;
        this.miles = num.doubleValue() * 0.000621371;
    }

    void milesTo(T1 num) {
        this.miles = num.doubleValue();
        this.km = num.doubleValue() * 1.5;
        this.meter = num.doubleValue() * 1.5 * 1000;
    }

    public static void printData(distConverter<?> d) {
        System.out.println("\nIn kilometers: " + d.km);
        System.out.println("In meters: " + d.meter);
        System.out.println("In miles: " + d.miles + "\n");

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        distConverter<Integer> n = new distConverter<Integer>(1, "miles");
        distConverter<Double> n1 = new distConverter<Double>(45.2, "km");

        distConverter.printData(n);
        distConverter.printData(n1);
    }
}
