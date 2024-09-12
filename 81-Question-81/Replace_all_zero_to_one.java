// Replace all the 0’s with 1 in a given integer
// Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

// Examples:

// Example 1:
// Input: N = 102003
// Output: 112113
// Explanation: The 2nd,4th and 5th position from left contain 0.The resultant integer has replaced the 0’s in those  positions with 1.

// Example 2:
// Input:  204
// Output: 214
// Explanation: The 2nd position from left contain 0. The resultant integer has replaced the 0 in that position with 1.

public class Replace_all_zero_to_one {
    public static int replace(int n){
        if(n==0){
            return 1;
        }
        int ans=0;int temp=1;
        while(n>0){
            int lastdigit=n%10;
            if(lastdigit==0){
                lastdigit=1;
            }
            ans=lastdigit*temp+ans;
            n=n/10;
            temp=temp*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(replace(102003));
        
    }
}
