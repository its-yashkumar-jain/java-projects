import java.util.*;

public class arrApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.print("\nEnter number of element: ");
        int n = sc.nextInt();
        System.out.print("\nEnter array elements: ");

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        Iterator<Integer> i = arr.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("\nSorted ArrayList: " + arr.toString());

        Collections.reverse(arr);
        System.out.println("\nReverse ArrayList: " + arr.toString());
        sc.close();
    }
}
