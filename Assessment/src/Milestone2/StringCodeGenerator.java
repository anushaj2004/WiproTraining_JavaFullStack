package Milestone2;

import java.util.Scanner;

public class StringCodeGenerator {

    public int getCodeThroughStrings(String input1) {
        
        String[] words = input1.trim().split("\\s+");

      
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        
        while (totalLength > 9) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10; 
                totalLength /= 10;       
            }
            totalLength = sum; 
        }

        return totalLength; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        sc.close();

        StringCodeGenerator generator = new StringCodeGenerator();
        int pin = generator.getCodeThroughStrings(input);

        System.out.println("Generated Code: " + pin);
    }
}

