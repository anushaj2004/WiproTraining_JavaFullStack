package Milestone2B;

import java.util.Scanner;

class UserMainCode1 {
    public String userIdGeneration(String input1, String input2, int input3, int input4) {
        String smallerName, longerName;
        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareToIgnoreCase(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }

        String pinStr = String.valueOf(input3);
        char lastLetter = smallerName.charAt(smallerName.length() - 1);
        char digitFromLeft = pinStr.charAt(input4 - 1);
        char digitFromRight = pinStr.charAt(pinStr.length() - input4);

        String userId = lastLetter + longerName + digitFromLeft + digitFromRight;

        StringBuilder toggled = new StringBuilder();
        for (char c : userId.toCharArray()) {
            if (Character.isUpperCase(c))
                toggled.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                toggled.append(Character.toUpperCase(c));
            else
                toggled.append(c);
        }
        return toggled.toString();
    }
}
