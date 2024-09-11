// Print all Prime Factors of the given number
// Problem Statement: Given an integer N, print all of its prime factors.

// Examples
// Example 1:
// Input: N=60
// Output: 2, 3, 5
// Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
// Example 2:
// Input: N=35
// Output: 5, 7
// Explanation: All factors/divisors of 35 include: 1, 5, 7, 35. Out of these, only 5 and 7 are prime.

public class print_all_prime_factors {
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
    public static  void primeFactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0 && isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primeFactors(60);
        
    }
}
