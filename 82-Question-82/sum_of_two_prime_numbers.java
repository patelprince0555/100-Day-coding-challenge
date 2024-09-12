// Express given number as Sum of Two Prime Numbers

// Problem: Given a number n, express the number as a sum of 2 prime numbers.

// Examples:

// Example 1:
// Input : N = 74
// Output : True . 
// Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

// Example 2:
// Input : N = 11
// Output : False. 
// Explanation: 11 cannot be expressed as sum of two prime numbers.

import java.util.Scanner;
public class sum_of_two_prime_numbers {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to find two prime numbers that sum up to n
    public static void findPrimeSum(int n) {
        boolean found = false;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " can be expressed as " + i + " + " + (n - i));
                found = true;
                break; // You can remove this line if you want all possible prime pairs.
            }
        }
        if (!found) {
            System.out.println(n + " cannot be expressed as a sum of two prime numbers.");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Find and print the sum of two prime numbers
        findPrimeSum(n);
    }
        
    }

