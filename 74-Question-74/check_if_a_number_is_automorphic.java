// Check if a number is Automorphic Number
// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

// Examples:

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

public class check_if_a_number_is_automorphic {
    public static boolean isAutomorphic(int n){
        int sqr=n*n;
        while(n>0){
            if(sqr%10!=n%10){
                return false;
               
            }
            sqr=sqr/10;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAutomorphic(76));
        
    }
}
