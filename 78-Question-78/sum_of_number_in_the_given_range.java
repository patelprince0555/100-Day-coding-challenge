// Find the sum of numbers in the given range
// Problem Statement: Find the sum of numbers in the given range.

// Examples:

// Example 1:
// Input: l=2, r=7
// Output: 27
// Explanation: 2+3+4+5+6+7=27. Therefore 27 is the answer.

// Example 2:
// Input: l=5, r=9
// Output: 35
// Explanation: 5+6+7+8+9=35. Therefore 35 is the answer.

public class sum_of_number_in_the_given_range {
    public static int sumofgivenRange(int n1,int n2){
        int sum=0;
        for(int i=n1;i<=n2;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofgivenRange(2, 07));
        
    }
}
