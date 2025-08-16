package assessment;

import java.util.*;

public class StableUnstablePassword {
    
    public static boolean isStable(int num) {
        String s = String.valueOf(num);
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        Collection<Integer> values = freqMap.values();
        int firstFreq = values.iterator().next();
        for (int freq : values) {
            if (freq != firstFreq) {
                return false;
            }
        }
        return true;
    }
    
    public static int findPassword(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isStable(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter number of inputs: ");
			int n = s.nextInt();
			int[] arr = new int[n];
			
			System.out.println("Enter the numbers:");
			for (int i = 0; i < n; i++) {
			    arr[i] = s.nextInt();
			}
			
			int password = findPassword(arr);
			System.out.println("Password = " + password);
		}
    }
}

