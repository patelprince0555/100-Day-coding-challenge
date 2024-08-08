// Average of all the elements in the array
// Problem Statement: Given an array, we have to find the average of all the elements in the array.

// Examples:

// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5}
// Output: 3
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.

// Example 2:
// Input:  N=6, array[] = {1,2,1,1,5,1}
// Output: 1.8
// Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8

public class Average_of_the_elements_in_the_array {
    public static void averageElements(int nums[]){
        double sum=0;
        int k=nums.length;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        double average = sum / k;
        System.out.println("The average is "+average);
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,1,5,1};
        averageElements(nums);
    }
}
