//Rearrange array in increasing-decreasing order
//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

// Examples:

// Example 1:
// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7
// Explanation: First three elements are in the ascending order and next three elements are in the descending order.

// Example 2:
// Input: 4 2 8 6 15 5 9 20
// Output: 2 4 5 6 20 15 9 8

import java.util.*;

public class Rearrange_Array_in_increasing_decreasing {
    public static void Rearrange_Array(int nums[]){
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            System.out.print(nums[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(nums[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int nums[]={8,7,1,6,5,9};
        Rearrange_Array(nums);
    }
}
