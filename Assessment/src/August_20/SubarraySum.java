package August_20;
import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int sum = 0, start = 0;
        boolean found = false;
        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > target && start < end) {
                sum -= arr[start++];
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("No subarray with sum " + target);
    }
}
