// Find Sum of AP Series
// Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

// a = first term of A.P.

// d= common Difference of A.P.

// n= Number of Terms in  A.P.

// Examples:

// Example 1:
// Input:
// n=4
// a=2
// d=2
// Output: 20
// Explanation: 2+4+6+8 = 20

// Input:
// n=8
// a=2
// d=5
// Output: 124
// Explanation: -2 +3 + 8 + 13 + 18 + 23 + 28 + 33 = 124

public class find_sum_of_AP_series {
    public static float apSeries(float a, float d, float n){
         float sum=(float) ((n/2.0)*(2.0*a+(n-1.0)*d));
        return sum;
    }

    public static float apSeries(int n[]){
        float sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(apSeries(2, 2, 4));
        int n[]={-2, 3 , 8 , 13 , 18 , 23 , 28 , 33};
        System.out.println(apSeries(n));
    }
}
