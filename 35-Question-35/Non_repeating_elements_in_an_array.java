// Find all the non-repeating elements in an array

// Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

// Examples:

// Example 1:
// Input:
//  Nums = [1,2,-1,1,3,1]
// Output:
//  2,-1,3
// Explanation:
//  1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

// Example 2:
// Input:
//  Nums = [1,2,3]
// Output:
//  1,2,3
// Explanation:
//  All elements present in the array occur once. Hence, every element is non-repeating.

import java.util.Arrays;

public class Non_repeating_elements_in_an_array {
    public static int[] nonrepatingElements(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]!=nums[i]){
                    nums[count]=nums[i];
                    count++;
                }
            }
        }
        // Create a new array with the correct size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,-1,1,3,1};
        int nums1[]=nonrepatingElements(nums);
        System.out.println(nums1);
        
    }
}
