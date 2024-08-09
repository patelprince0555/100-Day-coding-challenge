//Find Median of the given Array
// Problem Statement: Given an unsorted array, find the median of the given array.

// Examples:

// Example 1:
// Input: [2,4,1,3,5]
// Output: 3

// Example 2:
// Input: [2,5,1,7]
// Output: 3.5

import java.util.Arrays;

public class Median_of_the_given_Array {
    public static double MedainArray(int nums[]){
        Arrays.sort(nums);
        int n= nums.length;
        double Median=0;
        if(n%2==0){
            int index2=(n/2)-1;
            int index1=n/2;
             Median=(double)(nums[index1]+nums[index2])/2;
        }else{
              Median=nums[(n-1)/2];
        }
        return Median;
    }
    public static void main(String[] args) {
        int nums[]={2,4,1,3,5};
        System.out.println(MedainArray(nums));
        
    }
}
