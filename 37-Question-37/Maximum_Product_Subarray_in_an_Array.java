// Maximum Product Subarray in an Array

// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

// Examples
// Example 1:
// Input:

//  Nums = [1,2,3,4,5,0]
// Output:

//  120
// Explanation:

//  In the given array, we can see 1×2×3×4×5 gives maximum product value.


// Example 2:
// Input:
//  Nums = [1,2,-3,0,-4,-5]
// Output:

//  20
// Explanation:

//  In the given array, we can see (-4)×(-5) gives maximum product value.

public class Maximum_Product_Subarray_in_an_Array {
    public static void maximumProduct(int n[]){
        int maxproduct=Integer.MIN_VALUE;
        int tr=0;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int currproduct=1;
                for(int k=start;k<=end;k++){
                    currproduct=currproduct*n[k];
                }
                tr++;
                System.out.println(currproduct);
                if(maxproduct<currproduct){
                    maxproduct=currproduct;
                }
                
            }
        }
        System.out.println(maxproduct);
        System.out.println(tr);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,0};
        maximumProduct(nums);
        
    }
}
