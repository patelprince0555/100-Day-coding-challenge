// Check if a number is Armstrong Number or not
// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

// Examples
// Example 1:
// Input:N = 153
// Output:True
// Explanation: 13+53+33 = 1 + 125 + 27 = 153
// Example 2:
// Input:N = 371
// Output: True
// Explanation: 33+53+13 = 27 + 343 + 1 = 371

public class check_if_number_is_armstrong_number_or_not {
    public static boolean isArmstrong(int n) {
        int originalNumber = n; // Preserve the original value of n
        int count = 0;

        // Count the number of digits
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        temp = n; // Reset temp to n for sum calculation

        // Calculate the sum of the digits raised to the power of count
        while (temp != 0) {
            int digits = temp % 10;
            sum = sum + (int) Math.pow(digits, count);
            temp = temp / 10;
        }

        // Compare the sum with the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Output: true
    }
}
