import java.util.*;

public class arrIter {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("bike");
        arr.add("car");
        arr.add("Truck");
        arr.add(5);

        Iterator i = arr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
