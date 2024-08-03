// sort colours

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

public class Sort_colours {
    public  static void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
    public  static void sortColors(int[] nums) {
        int l=0;
        int i=0;
        int r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,l++,i++);
            }else if(nums[i]==2){
                swap(nums,i,r--);
            }else{
                i++;
            }
        }
    }
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        printArray(nums);
        
    }
}
