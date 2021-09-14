import java.io.*;

public class wordCount {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("words.txt");

        BufferedReader br = new BufferedReader(file);

        String st;
        int wordCount = 0, paraCount = 0, sentenceCount = 0, whitespaceCount = 0, charCount = 0;
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
        }
        if (sentenceCount >= 1) {
            paraCount += 1;
        }
        System.out.println("\nCharacter count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
        System.out.println("Paragraph count: " + paraCount);
        System.out.println("Whitespace count: " + whitespaceCount + "\n");
        br.close();
    }
}