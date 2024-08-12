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
    public static int[] nonRepeatingElements(int nums[]) {
        int n = nums.length;
        int count = 0;
        // Temporary array to hold non-repeating elements
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                temp[count] = nums[i];
                count++;
            }
        }
        
        // Create a new array with the correct size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, -1, 1, 3, 1};
        int nums1[] = nonRepeatingElements(nums);
        printArray(nums1);
    }
}
