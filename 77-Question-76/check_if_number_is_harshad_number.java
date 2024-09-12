// Check if the given number is Harshad(Or Niven) Number
// Problem Statement: Check if the number is a Harshad(or Niven) number or not.

// Examples:

// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

public class check_if_number_is_harshad_number {
    public static boolean isHarshad(int n){
        int orginalnumber=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }if(orginalnumber%sum==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHarshad(378));
        
    }
}
