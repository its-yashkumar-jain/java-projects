import java.io.*;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("words.txt");

        BufferedReader br = new BufferedReader(file);

        System.out.print("\nEnter substring to check for: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String st;
        int wordCount = 0, paraCount = 0, sentenceCount = 0, whitespaceCount = 0, charCount = 0, subCount = 0;
        System.out.println("\nFile content:");
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            if (st.equals("")) {
                paraCount += 1;
            } else {
                charCount += st.length();
                wordCount += st.split(" ").length;
                whitespaceCount += st.split(" ").length - 1;
                sentenceCount += st.split("[.?!;]+").length;
            }
            st += " ";
            if (st.split(str).length > 1) {

                subCount += st.split(str).length - 1;
            } else {
                if (st.equals(str)) {
                    subCount++;
                }
            }
        }
        if (sentenceCount >= 1) {
            paraCount += 1;
        }
        System.out.println("\n\"" + str + "\"" + " count: " + subCount);
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
        System.out.println("Paragraph count: " + paraCount);
        System.out.println("Whitespace count: " + whitespaceCount + "\n");
        br.close();
        sc.close();

    }
}