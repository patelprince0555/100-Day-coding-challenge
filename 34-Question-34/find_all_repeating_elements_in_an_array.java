//Find all repeating elements in an array
// Problem Statement: Find all the repeating elements present in an array.

// Examples:

// Example 1:
// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
//  1,2,4
// Explanation:
//  1,2 and 4 are the elements which are occurring more than once.

// Example 2:
// Input:
//  Arr[] = [1,1,0]
// Output:
//  1
// Explanation:
//  Only 1 is occurring more than once in the given array.

public class find_all_repeating_elements_in_an_array {
    public static int[] allRepeating(int arr[]){
        int n= arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    arr[count]=arr[i];
                    count++;
                }
            }
        }
         // Create a new array with the correct size
         int[] result = new int[count];
         for (int i = 0; i < count; i++) {
             result[i] = arr[i];
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
        int nums[]={1,1,2,3,4,4,5,2};
       int nums1[] =allRepeating(nums);
        printArray(nums1);
    }
}
