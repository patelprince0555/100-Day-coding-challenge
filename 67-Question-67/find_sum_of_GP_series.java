// Program to find Sum of GP Series
// Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as:-

// a, first term
// r, common ratio
// n, number of terms
//  Write a program to find the sum of the geometric Progression Series.

// Examples:

// Example 1:
// Input: a=1 , r=0.5 , n=3
// Output: 1.75
// Explanation: The sum of given GP Series is 1.75

// Example 2:
// Input: a=3 , r=5 , n=2
// Output: 18
// Explanation: The sum of the given GP Series is 18

public class find_sum_of_GP_series {
    public static int  gpSeries(int n,int a,int c){
        int sum=0;
        int term=1;
        while (term<=n) {
            sum=sum+a;
            a=a*c;
            term++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(gpSeries(2, 3, 5));        
    }
}
