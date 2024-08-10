// Adding Element in an Array

// Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

// Example:
// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
// Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 

public class Adding_Element_in_an_array {
    public static int[] insertBeginning(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        newArr[0] = element;
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    
    // Method to insert element at the end
    public static int[] insertEnding(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = element;
        return newArr;
    }
    
    // Method to insert element at a specific position (1-based index)
    public static int[] insertAtPosition(int[] arr, int element, int position) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[position - 1] = element;
        for (int i = position; i <= n; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
    
    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
       int newarr[]=insertBeginning(nums, 6);
       int newarr1[]=insertEnding(newarr, 7);
       int newarr2[]=insertAtPosition(newarr1, 8, 4);
       printArray(newarr2);
        
    }
}
