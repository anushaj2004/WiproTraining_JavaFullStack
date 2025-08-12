package Milestone2;

import java.util.Scanner;

public class SplitStringParts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String input2 = sc.nextLine();

        System.out.print("Enter third string: ");
        String input3 = sc.nextLine();

        Result res = processStrings(input1, input2, input3);

        System.out.println("Output 1: " + res.out1);
        System.out.println("Output 2: " + res.out2);
        System.out.println("Output 3: " + res.out3);

        sc.close();
    }

    public static Result processStrings(String input1, String input2, String input3) {
        String[] parts1 = splitIntoThreeParts(input1);
        String[] parts2 = splitIntoThreeParts(input2);
        String[] parts3 = splitIntoThreeParts(input3);

        String out1 = parts1[0] + parts2[0] + parts3[0];
        String out2 = parts1[1] + parts2[1] + parts3[1];
        String out3 = parts1[2] + parts2[2] + parts3[2];

        StringBuilder toggled = new StringBuilder();
        for (char ch : out3.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(Character.toUpperCase(ch));
            }
        }

        return new Result(out1, out2, toggled.toString());
    }

    private static String[] splitIntoThreeParts(String str) {
        int len = str.length();
        int rem = len % 3;
        int part = len / 3;
        String front, middle, end;

        if (rem == 0) {
            front = str.substring(0, part);
            middle = str.substring(part, 2 * part);
            end = str.substring(2 * part);
        } else if (rem == 1) {
            front = str.substring(0, part);
            middle = str.substring(part, part + part + 1);
            end = str.substring(part + part + 1);
        } else { 
            front = str.substring(0, part + 1);
            middle = str.substring(part + 1, part + 1 + part);
            end = str.substring(part + 1 + part);
        }
        return new String[]{front, middle, end};
    }
}

class Result {
    String out1;
    String out2;
    String out3;

    Result(String o1, String o2, String o3) {
        this.out1 = o1;
        this.out2 = o2;
        this.out3 = o3;
    }
}

