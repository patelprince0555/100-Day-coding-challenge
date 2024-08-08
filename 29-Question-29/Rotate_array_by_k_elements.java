// Rotate array by K elements : Block Swap Algorithm
// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements.

public class Rotate_array_by_k_elements {
    public  static void reverse(int nums[],int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public  static void rotate(int[] nums, int k) {
        int n =nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k);
        reverse(nums,k+1,n-1);
    }

    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums, 3);
        printArray(nums);
    }
}
