package assessment;
import java.util.*;

public class FixTheFormula {

    public static int fixTheFormula(String input1) {
        StringBuilder nums = new StringBuilder();
        StringBuilder ops = new StringBuilder();

        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                nums.append(ch);
            } else if ("+-*/".indexOf(ch) != -1) {
                ops.append(ch);
            }
        }

        int[] numbers = new int[nums.length()];
        for (int i = 0; i < nums.length(); i++) {
            numbers[i] = nums.charAt(i) - '0';
        }
        char[] operators = ops.toString().toCharArray();

        int result = numbers[0];
        for (int i = 0; i < operators.length; i++) {
            int nextNum = numbers[i + 1];
            switch (operators[i]) {
                case '+': result += nextNum; break;
                case '-': result -= nextNum; break;
                case '*': result *= nextNum; break;
                case '/': result /= nextNum; break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tricky string:");
        String input = sc.nextLine();
        int result = fixTheFormula(input);
        System.out.println("Final Answer: " + result);
        sc.close();
    }
}
