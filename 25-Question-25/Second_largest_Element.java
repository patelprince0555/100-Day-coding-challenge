// find Second largest element in array
// Example 1:
// Input:
//  [1,2,4,7,7,5]
// Output:
// 	Second Largest : 5

public class Second_largest_Element {
    public static void secondLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
       int  second_largest=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            second_largest=largest;
            largest=nums[i];
        }else if(nums[i]>second_largest){
            second_largest=nums[i];
        }else if (largest==second_largest) {
            second_largest=-1;
        }
       }
       System.out.println(second_largest);
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4,7,5};
        secondLargest(nums);
    }
}