// Find all Palindrome Numbers in a given range
// Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

// Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552

// Examples:

// Example 1:
// Input: min = 10 , max = 50
// Output: 11 22 33 44 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

// Example2:
// Input: min = 100 , max = 150
// Output: 101 111 121 131 141 
// Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.

public class palindrome_numbers_in_a_given_range {
    public static int ispalindrome(int n){
        int reverse=0;
       while(n!=0){
        int lastdigit = n%10;  // gives remainder
        reverse=reverse*10+lastdigit;
        n=n/10;  // gives quotient
       }
       return reverse;
    }

    public static void printPalindrome(int min , int max){
        for(int i =min;i<=max;i++){
            if(ispalindrome(i)==i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int min=10;
        int max=50;
        printPalindrome(min, max);
    }
}