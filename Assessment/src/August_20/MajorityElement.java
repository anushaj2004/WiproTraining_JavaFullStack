package August_20;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Boyer-Moore Voting Algorithm
        int candidate = arr[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) count++;
            else count--;
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Verify candidate
        count = 0;
        for (int num : arr) if (num == candidate) count++;

        if (count > n / 2)
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("No Majority Element exists.");
    }
}
