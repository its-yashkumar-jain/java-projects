import java.util.regex.*;
import java.util.Scanner;

public class regMatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter email: ");
        String email = sc.nextLine();
        sc.close();

        if (Pattern.matches("[a-zA-Z]+[\\w .]*@\\w+[.]\\w+", email)) {
            System.out.println("Outcome: Valid email");
        } else {
            System.out.println("Outcome: Invalid email");
        }
        System.out.print("\n");

    }
}
