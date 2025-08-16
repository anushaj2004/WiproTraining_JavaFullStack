package assessment;

import java.util.Scanner;

public class UserIdGeneration {
    
    public static String generateUserId(String firstName, String lastName, String pin, int n) {
        String smaller, longer;

        if (firstName.length() < lastName.length()) {
            smaller = firstName;
            longer = lastName;
        } else if (firstName.length() > lastName.length()) {
            smaller = lastName;
            longer = firstName;
        } else {
            if (firstName.compareToIgnoreCase(lastName) < 0) {
                smaller = firstName;
                longer = lastName;
            } else {
                smaller = lastName;
                longer = firstName;
            }
        }

        char lastLetterSmaller = smaller.charAt(smaller.length() - 1);
        char digitFromLeft = pin.charAt(n - 1);
        char digitFromRight = pin.charAt(pin.length() - n);

        String userId = lastLetterSmaller + longer + digitFromLeft + digitFromRight;

        StringBuilder toggled = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }

        return toggled.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter First Name: ");
			String firstName = sc.nextLine();

			System.out.print("Enter Last Name: ");
			String lastName = sc.nextLine();

			System.out.print("Enter PIN: ");
			String pin = sc.nextLine();

			System.out.print("Enter N: ");
			int n = sc.nextInt();

			String userId = generateUserId(firstName, lastName, pin, n);
			System.out.println("Generated User ID: " + userId);
		}
    }
}
