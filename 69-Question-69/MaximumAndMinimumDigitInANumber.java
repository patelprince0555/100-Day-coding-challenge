// Maximum and Minimum Digit in a Number
// Problem Statement: Given a number N, print the smallest and largest digits present in the number.

// Examples:

// Example 1:
// Input: N = 2746
// Output: Largest digit: 7
//         Smallest digit: 2
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

// Example 2:
// Input: N = 23004
// Output: Largest digit : 4
//         Smallest digit : 0
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

public class MaximumAndMinimumDigitInANumber {
    public static int[] maximumAndminimum(int number) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        while (number != 0) {
            int digit = number % 10;
            largest = Math.max(largest, digit);
            smallest = Math.min(smallest, digit);
            number = number / 10;
        }

        // Return an array with largest and smallest digits
        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        int number = 526389;
        int[] result = maximumAndminimum(number);
        System.out.println("Largest digit: " + result[0]);
        System.out.println("Smallest digit: " + result[1]);
    }
}
