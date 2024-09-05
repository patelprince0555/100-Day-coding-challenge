// find second smallest element in an array
// Problem Statement: Given an array, find the second smallest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
// Example 1:
// Input:
//  [1,2,4,7,7,5]
// Output:
//  Second Smallest : 2

import java.util.Scanner;

public class Second_Smallest_number {
    public static void SecondSmallest(int nums[]){
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                second_min=min;
                min=nums[i];
            }else if (nums[i]<second_min && nums[i]!=min) {
                second_min=nums[i];
            } else if(second_min==Integer.MAX_VALUE){
                second_min=-1;
            }
        }
        System.out.println("second smallest number is: "+second_min);
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int n1[] = new int[n];

        // input Array
        for(int i=0;i<n;i++){
            n1[i]=sc.nextInt();
        }

        // display method 1
        for(int i=0;i<n1.length;i++){
            System.out.print(n1[i]+" ");
        }
        System.out.println();

        // method 2
        // for (int i : n1) {
        //     System.out.print(i + " ");
        // }
        SecondSmallest(n1);
        
    }
}
