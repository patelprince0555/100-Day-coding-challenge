// Greatest of three numbers

// Problem Statement: Given three numbers. Find the greatest of three numbers.

// Examples:

// Example 1:
// Input: 1 3 5
// Output: 5
// Explanation: Answer is 5.Since 5 is greater than 1 and 3.

// Example 2:
// Input: 1.123  1.124 1.125
// Output: 1.125
// Explanation: Answer is 1.125. Since 1.125 is greater than 1.123 and 1.124

public class Greatest_of_three_numbers {
    public static void main(String[] args) {
    double num1 = 1.123, num2 = 1.124, num3 = 1.125;
    System.out.println("The greatest of the three numbers is "+Math.max(num1, Math.max(num2, num3)));
    }
}
