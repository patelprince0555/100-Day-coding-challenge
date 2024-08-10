//Remove Duplicates From an Unsorted Array

// Problem Statement: Given an unsorted array, remove duplicates from the array.

// Examples:

// Example 1:
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}

// Explanation: Removed all the duplicate elements

// Example 2:
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {3,4,9,2,1,10,34,89}
// Explanation: Removed all the duplicate elements

import java.util.Arrays;

public class Remove_Duplicates_from_an_unsorted_Array {
    public static int[] removeDuplicates(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0 || n == 1) {
            return nums;
        }

        int j = 0; // index for the next unique element

        for (int i = 0; i < n ; i++) {
            if ( i<n-1&&nums[i] == nums[i + 1]) {
                continue;
            }
            else{
                nums[j]=nums[i];
                j++;
            }
        }
        // Create a new array with the correct size
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = nums[i];
        }

        return result;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 9, 3, 1, 3, 9};
        int[] uniqueArray = removeDuplicates(arr);
        printArray(uniqueArray);
    }
}