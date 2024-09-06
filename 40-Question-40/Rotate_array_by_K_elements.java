
// Rotate array by K elements

// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

// Examples:

// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position .

// Example 2:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.

public class Rotate_array_by_K_elements {
    public static void RotateArray(int numbers[],int start,int end){
        while (start<=end) {
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={3,7,8,9,10,11};
        int n=nums.length;
        int k=2;
        RotateArray(nums, 0, n-1);
        RotateArray(nums, 0, k);
        RotateArray(nums, k+1, n-1);
        printArray(nums);
    }
}
