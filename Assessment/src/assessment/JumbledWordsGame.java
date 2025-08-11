package assessment;
import java.util.*;

public class JumbledWordsGame {

    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < word.length(); i += 2) {
            odd.append(word.charAt(i));
        }

        if (method == 1) {
            for (int i = word.length() - 1; i >= 0; i--) {
                if (i % 2 == 1) {
                    even.append(word.charAt(i));
                }
            }
        } else if (method == 2) {
            for (int i = 1; i < word.length(); i += 2) {
                even.append(word.charAt(i));
            }
        }

        return odd.append(even).toString();
    }

    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.toUpperCase().split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(jumbleWord(w, input2)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter method number (1 or 2):");
        int method = sc.nextInt();
        String result = JumbledWords(sentence, method);
        System.out.println("Jumbled Sentence: " + result);
        sc.close();
    }
}
