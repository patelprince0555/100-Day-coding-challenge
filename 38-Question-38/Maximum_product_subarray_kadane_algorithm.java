// maximum product subarray in an array by kadane's algorithm

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

public class Maximum_product_subarray_kadane_algorithm {
    public static void maximumProduct(int numbers[]){
        int cs=1;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs*numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,0};
        maximumProduct(nums);
    }
}
