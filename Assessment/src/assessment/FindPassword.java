package assessment;
import java.util.*;

public class FindPassword {

    public static boolean isStable(int num) {
        String s = String.valueOf(num);
        int[] freq = new int[10];

        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }

        int expectedFreq = 0;
        for (int f : freq) {
            if (f > 0) {
                if (expectedFreq == 0) {
                    expectedFreq = f;
                } else if (f != expectedFreq) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int calculatePassword(int[] numbers) {
        int stableCount = 0;
        int unstableCount = 0;

        for (int num : numbers) {
            if (isStable(num)) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }

        return (unstableCount * 10) + stableCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            inputs[i] = sc.nextInt();
        }

        int password = calculatePassword(inputs);
        System.out.println("Password: " + password);

        sc.close();
    }
}
