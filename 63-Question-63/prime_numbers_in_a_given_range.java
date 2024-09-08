// Prime Numbers in a given range
// Problem Statement: Given a and b, find prime numbers in a given range [a,b], (a and b are included here).

// Examples:

// Examples:
// Input: 2 10
// Output: 2 3 5 7 
// Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

// Example 2:
// Input: 10 16
// Output: 11 13 
// Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.

public class prime_numbers_in_a_given_range {

    public static boolean isprime(int n){
        if(n<1||n==1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimenumber(int min , int max){
        for(int i =min;i<=max;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printPrimenumber(10, 16);
    }
}
