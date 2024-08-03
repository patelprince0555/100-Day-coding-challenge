// Find the smallest element in an array
// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 0
// Explanation: 0 is the smallest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 5
// Explanation: 5 is the smallest element in the array.

public class Smallest_element_in_an_array {
    public static int SmallestElement(int nums[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest=nums[i];
            }
        }return smallest;
    }
    public static void main(String[] args) {
        int nums1[]={2,5,1,3,0,5};
        System.out.println(SmallestElement(nums1));
        
    }
}
