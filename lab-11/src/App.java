class gen<T extends Number> {
    Double sum = 0.0, avg = 0.0;

    void getAvg(T arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            this.sum += arr[i].doubleValue();
        }
        this.avg = this.sum / len;
        System.out.println("\nAverage is: " + this.avg);

    }

    public static boolean isAvgSame(gen<?> a, gen<?> b) {
        if (a.avg.equals(b.avg)) {
            return true;
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Integer l1[] = { 5, 1, 2, 3, 4 };
        Double l2[] = { 0.0, 3.0, 6.0 };

        gen<Integer> g1 = new gen<Integer>();
        g1.getAvg(l1);
        gen<Double> g2 = new gen<Double>();
        g2.getAvg(l2);

        if (gen.isAvgSame(g1, g2) == true) {
            System.out.println("\nBoth the averages are same!\n");
        } else {
            System.out.println("\nBoth the averages are not same!\n");
        }

    }
}
