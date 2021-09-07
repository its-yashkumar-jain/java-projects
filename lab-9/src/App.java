import java.util.Scanner;

public class App {

    static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(" ]\n");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of element: ");
        int n = sc.nextInt();
        System.out.print("\nEnter array elements: ");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nArray: ");
        printArr(arr);

        System.out.print("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        printArr(arr);

        System.out.print("\nReverse array: ");
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        printArr(arr);

        sc.close();

    }
}
