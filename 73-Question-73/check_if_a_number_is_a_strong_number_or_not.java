// Check if a number is a Strong Number or not
// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples:

// Examples 1:
// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:  26
// Output: No
// Explanation: 2! + 6! = 722. Hence 26 is not a strong number.

public class check_if_a_number_is_a_strong_number_or_not {
    public static int printfactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static boolean strongNumber(int n){
        int orginalnumber=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
           int num= printfactorial(digit);
           sum=sum+num;
           n=n/10;
        }if(sum==orginalnumber){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(strongNumber(145));
    }
}
