package August_20;

import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char[] a1 = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] a2 = s2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}

